package it.chutien.preforinterview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import it.chutien.preforinterview.Factory.Decorator.Computer
import it.chutien.preforinterview.Factory.Decorator.Disk
import it.chutien.preforinterview.Factory.GoF.Connection
import it.chutien.preforinterview.Factory.GoF.SecureFactory
import it.chutien.preforinterview.Observer.Database
import it.chutien.preforinterview.Observer.Archiver
import it.chutien.preforinterview.Observer.Boss
import it.chutien.preforinterview.Observer.Client
import it.chutien.preforinterview.Strategy.Car
import it.chutien.preforinterview.Strategy.GoByDrivingAlgorithm
import it.chutien.preforinterview.Strategy.GoByFlyingAlgorithm
import it.chutien.preforinterview.Strategy.Jet

class MainActivity : AppCompatActivity() {

    val TAG: String = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main)


        //decorator pattern
        var computer = Computer()
        computer = Disk(computer)
        Log.d("Decorator", "You get a " + computer.description())


        //factory pattern
        var secureFactory = SecureFactory()
        var connection: Connection = secureFactory.createConnection("Oracle")
        Log.d("Factory", "You're connect with " + connection.description())


        //strategy pattern
        var car = Car()
        var jet = Jet()
        car.go()
        car.setGoAlgorithm(GoByFlyingAlgorithm())
        jet.setGoAlgorithm(GoByDrivingAlgorithm())
        jet.go()

        //observer pattern
        var database = Database()
        var archiver = Archiver()
        var client = Client()
        var boss = Boss()

        database.addObserver(archiver)
        database.addObserver(client)
        database.addObserver(boss)
        database.deleteObserver(client)//remove observer of client
        database.editRecord("update", "table 99")


    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

}
