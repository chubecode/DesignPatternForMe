package it.chutien.preforinterview.Strategy

import android.util.Log

open class GoByDrivingAlgorithm : GoAlgorithm {
    override fun go() {
        Log.d("Strategy", "Now I'm driving.")
    }

}