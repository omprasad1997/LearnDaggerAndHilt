package com.example.learndaggerandhilt.chezzycode

import com.example.learndaggerandhilt.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent


@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponentNew {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build() : UserRegistrationComponentNew
        fun retryCount(@BindsInstance retryCount : Int) : Builder
    }
}