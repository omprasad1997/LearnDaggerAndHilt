package com.example.learndaggerandhilt.chezzycode

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email : String, password : String)
}

@ApplicationScope
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email : String, password : String){
        Log.d("TAG", "User saved to DB")
    }
}

class FirebaseRepository : UserRepository{
    override fun saveUser(email : String, password : String){
        Log.d("TAG", "User saved to Firebase")
    }
}