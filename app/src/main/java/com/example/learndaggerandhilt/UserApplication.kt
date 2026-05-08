package com.example.learndaggerandhilt

import android.app.Application
import com.example.learndaggerandhilt.chezzycode.AppComponent
import com.example.learndaggerandhilt.chezzycode.DaggerAppComponent

class UserApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()
    }
}