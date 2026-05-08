package com.example.learndaggerandhilt.chezzycode

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationServiceModule {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService(3)
    }

    @Named("email")
    @Provides
    fun getEmailService() : NotificationService{
        return EmailService()
    }
}