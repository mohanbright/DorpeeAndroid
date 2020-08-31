package com.droid.dorpee.ui.auth.static

class CapacityCheck{
    companion object{
        private var capacity: Int = 0
        fun  getValue(): Int{
            return capacity
        }
        fun  setValue(capacityset : Int): Int{
            capacity = capacityset
            return capacity
        }
    }
}