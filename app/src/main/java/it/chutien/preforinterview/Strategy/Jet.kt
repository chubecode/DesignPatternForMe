package it.chutien.preforinterview.Strategy

open class Car : Vehice() {

    init {
        setGoAlgorithm(GoByDrivingAlgorithm())
    }
}