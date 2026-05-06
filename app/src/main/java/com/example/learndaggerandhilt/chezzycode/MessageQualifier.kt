package com.example.learndaggerandhilt.chezzycode

import java.lang.annotation.Documented
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier()
