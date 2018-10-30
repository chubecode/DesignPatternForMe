package it.chutien.preforinterview.Observer
import android.util.Log
import java.util.*

class Boss : Observer {
    override fun update(operation: Observable, record: Any) {
        operation as Database
        Log.d("Observer", "The boss says a ${operation.operation} operation was performed on ${operation.record}")
    }
}