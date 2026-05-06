package com.example.learndaggerandhilt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.learndaggerandhilt.chezzycode.DaggerUserRegistrationComponentNew
import com.example.learndaggerandhilt.chezzycode.NotificationServiceModule
import com.example.learndaggerandhilt.chezzycode.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val component = DaggerUserRegistrationComponentNew.builder().notificationServiceModule(
            NotificationServiceModule(3)
        ).build()
        component.inject(this)
        userRegistrationService.registerUser("james.c.mcreynolds@example-pet-store.com", "11111")
    }
}