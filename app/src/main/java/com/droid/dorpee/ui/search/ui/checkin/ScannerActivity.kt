package com.droid.dorpee.ui.search.ui.checkin

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityScannerBinding
import com.droid.dorpee.ui.search.viewmodel.DashboardViewModel
import com.google.android.material.snackbar.Snackbar
import com.google.zxing.BarcodeFormat
import com.google.zxing.Result
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import me.dm7.barcodescanner.zxing.ZXingScannerView

class ScannerActivity : AppCompatActivity(), ZXingScannerView.ResultHandler {
    private lateinit var binding: ActivityScannerBinding
    var viewModel: DashboardViewModel? = null
    override fun handleResult(p0: Result?) {
        if (p0 != null) {
            val intent = Intent()
            setResult(Activity.RESULT_OK, intent)
            intent.putExtra("venueId",p0.text)
            finish()

            Toast.makeText(this, p0.text, Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScannerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.qrCodeScanner.setFormats(listOf(BarcodeFormat.QR_CODE))
        binding.qrCodeScanner.setAutoFocus(true)
        binding.qrCodeScanner.setLaserColor(R.color.colorAccent)
        binding.qrCodeScanner.setMaskColor(R.color.colorAccent)

        binding.imageViewBack.setOnClickListener {
            val intent = Intent()
            setResult(Activity.RESULT_CANCELED, intent)
//            intent.putExtra("venueId",p0.text)
            finish()
//          onBackPressed()
        }

        onCameraPermission()
    }

    private fun onCameraPermission() {


        Dexter.withActivity(this)
            .withPermissions(
                Manifest.permission.CAMERA
            )
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                    if (report.areAllPermissionsGranted()) {
                        binding.qrCodeScanner.startCamera()
                        binding.qrCodeScanner.setResultHandler(this@ScannerActivity)
                    } else {
                        Snackbar.make(binding.rootViewScanner,"Please allow camera permission to scan tank", Snackbar.LENGTH_INDEFINITE).setAction("Allow"
                        ) {
                            startActivityForResult(Intent(Settings.ACTION_SETTINGS), 0)
                        }
                    }
                }

                override fun onPermissionRationaleShouldBeShown(
                    permissions: List<PermissionRequest>,
                    token: PermissionToken
                ) {
                    token.continuePermissionRequest()
                }
            }).check()
    }


    override fun onPause() {
        super.onPause()
        binding.qrCodeScanner.stopCamera()
    }

}
