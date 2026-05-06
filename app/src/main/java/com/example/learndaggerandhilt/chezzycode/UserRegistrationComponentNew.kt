package com.example.learndaggerandhilt.chezzycode

import com.example.learndaggerandhilt.MainActivity
import dagger.Component


@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponentNew {
    fun inject(mainActivity: MainActivity)
}