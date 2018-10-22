package it.chutien.preforinterview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import it.chutien.preforinterview.Factory.Decorator.Computer
import it.chutien.preforinterview.Factory.Decorator.Disk
import it.chutien.preforinterview.Factory.GoF.Connection
import it.chutien.preforinterview.Factory.GoF.SecureFactory

class MainActivity : AppCompatActivity() {

    val TAG: String = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main)

        var computer = Computer()
        computer = Disk(computer)
        Log.d(TAG, "You get a " + computer.description())


        var secureFactory = SecureFactory()

        var connection: Connection = secureFactory.createConnection("Oracle")

        Log.d(TAG, "You're connect with " + connection.description())


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
