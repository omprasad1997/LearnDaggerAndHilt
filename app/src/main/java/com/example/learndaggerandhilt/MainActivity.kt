package com.example.learndaggerandhilt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.learndaggerandhilt.chezzycode.EmailService
import com.example.learndaggerandhilt.chezzycode.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent
        val userRegistrationComponent = appComponent.getUserRegistrationComponentBuilder().retryCount(3).build()
        userRegistrationComponent.inject(this)

        userRegistrationService.registerUser("james.c.mcreynolds@example-pet-store.com", "11111")
    }
}