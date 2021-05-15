package com.hex.springcourse.beans.music

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Qualifier(ClassicalMusic.TAG)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class ClassicalMusic private constructor() : Music {

    override fun getSongs() = listOf(
        "Liszt — Hungarian Rhapsody",
        "Shostakovich — String Quartet 8",
        "Saint-Saëns — The Carnival of the Animals"
    )

    companion object {

        const val TAG = "ClassicalMusic"

        // при скоупе singleton будет вызываться единожды и каждый getBean будет возвращать тот же объект
        @JvmStatic
        fun getClassicalMusic() = ClassicalMusic()
    }
}