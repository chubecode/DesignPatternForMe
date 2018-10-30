package it.chutien.preforinterview.Strategy

import android.util.Log

open class GoByFlyingAlgorithm : GoAlgorithm {
    override fun go() {
        Log.d("Strategy", "Now I'm flying.")
    }

}