package com.example.learndaggerandhilt.chezzycode

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService() : AnalyticsService {
            return MixPanel()
    }
}