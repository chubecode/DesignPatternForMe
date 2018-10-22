package it.chutien.preforinterview.Factory.GoF

open class SecureMySQLConnection : Connection() {
    override fun description():String{
        return "Secure by My SQL"
    }
}