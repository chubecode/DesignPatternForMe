package it.chutien.preforinterview.Factory.GoF

open class SecureFactory : ConnectionFactory() {
    public override fun createConnection(type: String): Connection {
        if (type.equals("Oracle")) {
            return SecureOracleConnection()
        } else {
            return SecureMySQLConnection()
        }
    }

}