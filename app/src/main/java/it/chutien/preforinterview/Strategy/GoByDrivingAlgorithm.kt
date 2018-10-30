package it.chutien.preforinterview.Strategy

import android.util.Log

class GoByDrivingAlgorithm : GoAlgorithm {
    override fun go() {
        Log.d("Strategy", "Now I'm driving.")
    }

}