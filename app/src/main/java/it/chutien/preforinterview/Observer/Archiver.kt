package it.chutien.preforinterview.Observer

import android.util.Log
import java.util.*

class Archiver : Observer {
    override fun update(operation: Observable, record: Any) {
        operation as Database
        Log.d("Observer", "The archive says a ${operation.operation} operation was performed on ${operation.record}")
    }
}