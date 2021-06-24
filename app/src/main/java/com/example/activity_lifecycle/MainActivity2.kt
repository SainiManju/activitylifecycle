package com.example.activity_lifecycle

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity2: AppCompatActivity() {
    val TAG = "Main Activity 2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG,"oncreate")
    }
        override fun onStart() {
            super.onStart()
            Log.d(TAG,"onStart")
        }

        override fun onResume() {
            super.onResume()
            Log.d(TAG,"onResume")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG,"onPause")
        }

        override fun onStop() {
            super.onStop()
            Log.d(TAG,"onStop")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d(TAG,"onRestart")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG,"onDestroy")
        }


    }

