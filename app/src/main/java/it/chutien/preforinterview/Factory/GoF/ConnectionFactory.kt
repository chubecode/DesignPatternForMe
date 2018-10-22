package it.chutien.preforinterview.Factory.GoF

abstract class ConnectionFactory{

    protected abstract fun createConnection(type:String):Connection
}