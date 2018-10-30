package it.chutien.preforinterview.Strategy

class Car : Vehice() {

    init {
        setGoAlgorithm(GoByDrivingAlgorithm())
    }
}