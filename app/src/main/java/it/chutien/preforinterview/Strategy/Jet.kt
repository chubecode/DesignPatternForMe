package it.chutien.preforinterview.Strategy

class Jet : Vehice() {

    init {
        setGoAlgorithm(GoByFlyingAlgorithm())
    }
}