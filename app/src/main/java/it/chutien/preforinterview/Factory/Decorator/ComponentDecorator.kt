package it.chutien.preforinterview.Factory.Decorator

abstract class ComponentDecorator : Computer() {
    abstract override fun description(): String
}