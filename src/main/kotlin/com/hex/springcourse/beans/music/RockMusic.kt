package com.hex.springcourse.beans.music

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Qualifier(RockMusic.TAG)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class RockMusic private constructor() : Music {

    override fun getSongs() = listOf(
        "Jimi Hendrix — Wind cries Mary",
        "Metallica — Nothing Else Matter",
        "Nirvana — Smells Like Teen Spirit"
    )

    companion object {

        const val TAG = "RockMusic"

        // при скоупе singleton будет вызываться единожды и каждый getBean будет возвращать тот же объект
        @JvmStatic
        fun getRockMusic() = RockMusic()
    }
}