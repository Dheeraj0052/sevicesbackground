package com.example.implementingservices

import android.app.IntentService
import android.content.Intent
import android.util.Log

class DownloadIntentServices : IntentService("Intentservicefordownload")
{      val tag =javaClass.simpleName
    override fun onCreate() {
        super.onCreate()
        Log.e(tag,"serviceStarted")
    }

    override fun onHandleIntent(intent: Intent?) {

        Log.e(tag,"Network call started")

        Thread.sleep(2000)
        //Making a network call here

        Log.e(tag,"Network call finished")
        //make the network request
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag,"servicesEnded")
    }
}