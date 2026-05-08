package com.example.learndaggerandhilt.chezzycode

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}