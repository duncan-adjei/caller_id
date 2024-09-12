package com.firstorion.engageplugin.flutter_engage_plugin_example

import android.util.Log
import com.firstorion.engage.core.EngageApp
import com.firstorion.engage.core.IEngageLoggingInterceptor
import io.flutter.app.FlutterApplication

class MyApplication : FlutterApplication(), IEngageLoggingInterceptor {

    override fun onCreate() {
        super.onCreate()

        EngageApp.Settings.setLoggingInterceptor(this)
    }
    override fun intercept(message: String, level: Int) {
        println("engage.app  $message" )
    }
}