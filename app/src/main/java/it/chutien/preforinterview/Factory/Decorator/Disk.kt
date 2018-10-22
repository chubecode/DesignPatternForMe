package it.chutien.preforinterview.Factory.Decorator

open class Disk : ComponentDecorator {
    var computer: Computer

    constructor(computer: Computer) {
        this.computer = computer
    }

    override fun description(): String {
        return computer.description() + " and a Disk"
    }

}