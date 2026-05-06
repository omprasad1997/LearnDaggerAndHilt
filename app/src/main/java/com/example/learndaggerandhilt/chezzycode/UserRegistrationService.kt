package com.example.learndaggerandhilt.chezzycode

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val repository: UserRepository,
                              @MessageQualifier private val notificationService: NotificationService) {

    fun registerUser(email : String, password : String){
        repository.saveUser(email, password)
        notificationService.send(email, "william.henry.harrison@example-pet-store.com", "User registered successfully")
    }
}