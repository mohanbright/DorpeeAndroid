package com.droid.dorpee.utils

import android.os.Handler
import android.os.Looper

import java.io.File
import java.io.FileInputStream
import java.io.IOException

import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okio.BufferedSink

class ProgressRequestBody(
    private val mFile: File,
    private val mListener: UploadCallbacks,
    private val mediaType: String
) : RequestBody() {

    init {
        mListener.uploadStart()

    }

    override fun contentType(): MediaType? {
        // i want to upload only images
        return mediaType.toMediaTypeOrNull()
    }

    @Throws(IOException::class)
    override fun contentLength(): Long {
        return mFile.length()
    }

    @Throws(IOException::class)
    override fun writeTo(sink: BufferedSink) {
        val fileLength = mFile.length()
        val buffer = ByteArray(DEFAULT_BUFFER_SIZE)

        FileInputStream(mFile).use { `in` ->
            var uploaded: Long = 0
            var read: Int= `in`.read(buffer)
            val handler = Handler(Looper.getMainLooper())
            while (read  != -1) {
                uploaded += read.toLong()
                sink.write(buffer, 0, read)
                handler.post(ProgressUpdater(uploaded, fileLength))
                read = `in`.read(buffer)
            }
        }
    }

    interface UploadCallbacks {
        fun onProgressUpdate(percentage: Int)

        fun onError()

        fun onFinish()

        fun uploadStart()
    }

    private inner class ProgressUpdater internal constructor(
        private val mUploaded: Long,
        private val mTotal: Long
    ) : Runnable {

        override fun run() {
            try {

                val progress = (100 * mUploaded / mTotal).toInt()

                if (progress == 100)
                    mListener.onFinish()
                else
                    mListener.onProgressUpdate(progress)
            } catch (e: ArithmeticException) {
                mListener.onError()
                e.printStackTrace()
            }

        }
    }

    companion object {
        private val DEFAULT_BUFFER_SIZE = 2048
    }
}