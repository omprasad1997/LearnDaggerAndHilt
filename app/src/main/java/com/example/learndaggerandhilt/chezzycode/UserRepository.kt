package com.example.learndaggerandhilt.chezzycode

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email : String, password : String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email : String, password : String){
        Log.d("TAG", "User saved to DB")
        analyticsService.trackEvent("Save User", "Create")
    }
}

class FirebaseRepository(var analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email : String, password : String){
        Log.d("TAG", "User saved to Firebase")
        analyticsService.trackEvent("Save User", "Create")
    }
}