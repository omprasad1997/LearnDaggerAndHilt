package com.example.learndaggerandhilt.chezzycode

import com.example.learndaggerandhilt.MainActivity
import dagger.Subcomponent


@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponentNew {
    fun inject(mainActivity: MainActivity)

//    @Subcomponent.Factory
//    interface Factory{
//        fun create(@BindsInstance retryCount : Int) : UserRegistrationComponentNew
//    }
}