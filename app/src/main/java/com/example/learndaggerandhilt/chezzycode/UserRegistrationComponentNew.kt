package com.example.learndaggerandhilt.chezzycode

import com.example.learndaggerandhilt.MainActivity
import dagger.BindsInstance
import dagger.Component


@ActivityScope
@Component(dependencies = [AppComponent::class],modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponentNew {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount : Int, appComponent: AppComponent) : UserRegistrationComponentNew
    }
}