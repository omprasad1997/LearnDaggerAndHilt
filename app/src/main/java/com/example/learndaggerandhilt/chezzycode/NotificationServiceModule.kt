package com.example.learndaggerandhilt.chezzycode

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationServiceModule(var retryCount:Int) {

    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService() : NotificationService{
        return EmailService()
    }
}