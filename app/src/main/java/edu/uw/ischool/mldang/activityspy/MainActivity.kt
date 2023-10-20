package edu.uw.ischool.mldang.activityspy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate event fired: $savedInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy event fired")
        Log.e("MainActivity","We're going down, Captain!")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume event fired")
    }


}