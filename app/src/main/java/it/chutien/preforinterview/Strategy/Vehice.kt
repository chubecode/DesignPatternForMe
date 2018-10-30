package it.chutien.preforinterview.Strategy

abstract class Vehice {

    private lateinit var goAlgorithm: GoAlgorithm

    fun setGoAlgorithm(algorithm: GoAlgorithm) {
        this.goAlgorithm = algorithm
    }

    fun go() {
        goAlgorithm.go()
    }
}