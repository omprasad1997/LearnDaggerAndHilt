package com.example.learndaggerandhilt.chezzycode

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentBuilder() : UserRegistrationComponentNew.Builder
}