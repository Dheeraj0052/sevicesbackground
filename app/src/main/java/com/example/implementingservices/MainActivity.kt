package com.example.implementingservices

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startIntentService = Intent(this, DownloadIntentServices::class.java).apply {
            putExtra("COUNT", 5)
            putExtra("KEY", "HELLO")
        }

     btnService.setOnClickListener(object : View.OnClickListener{
         override fun onClick(v: View?) {
            startService(startIntentService)
             Log.e("Tag ","hello")
         }
     })
    }
}
