package it.chutien.preforinterview.Factory.GoF

open class SecureOracleConnection : Connection() {
    override fun description(): String {
        return "Secure by Oracle"
    }
}