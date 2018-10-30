package it.chutien.preforinterview.Observer

import java.util.*

class Database : Observable() {

    lateinit var operation: String
    lateinit var record: String

    fun editRecord(operation: String, record: String) {
        this.operation = operation
        this.record = record
        setChanged()
        notifyObservers(Any())
    }




}