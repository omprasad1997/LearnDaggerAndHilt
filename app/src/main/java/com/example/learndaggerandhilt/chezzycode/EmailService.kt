package com.example.learndaggerandhilt.chezzycode

import android.util.Log
import javax.inject.Inject


interface NotificationService {
    fun send(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationService{
    override fun send(to:String, from:String, body:String){
        Log.d("TAG", "Email sent")
    }
}

class MessageService(var retryCount : Int) : NotificationService{
    override fun send(to:String, from:String, body:String){
        Log.d("TAG", "Message sent - Retry count $retryCount")
    }
}