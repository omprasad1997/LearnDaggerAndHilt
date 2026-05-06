package com.example.learndaggerandhilt.chezzycode

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}