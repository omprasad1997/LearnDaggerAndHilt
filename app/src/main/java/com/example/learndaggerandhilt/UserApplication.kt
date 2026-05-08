package com.example.learndaggerandhilt

import android.app.Application
import com.example.learndaggerandhilt.chezzycode.DaggerUserRegistrationComponentNew
import com.example.learndaggerandhilt.chezzycode.UserRegistrationComponentNew

class UserApplication : Application() {

    lateinit var userRegistrationComponentNew: UserRegistrationComponentNew

    override fun onCreate() {
        super.onCreate()

        userRegistrationComponentNew = DaggerUserRegistrationComponentNew.factory().create(3)
    }
}