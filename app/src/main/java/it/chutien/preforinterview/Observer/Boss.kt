package it.chutien.preforinterview.Observer

import android.util.Log

class Archiver : Observer {
    override fun update(operation: String, record: String) {
        Log.d("Observer", "The archive says a $operation operation was performed on $record")
    }
}