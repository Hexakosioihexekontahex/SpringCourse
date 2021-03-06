package com.hex.springcourse.beans.music

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Qualifier(MetalMusic.TAG)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class MetalMusic private constructor() : Music {

    override fun getSongs() = listOf(
        "Infant Annihilator — Blasphemian",
        "Watain — Puzzles Ov Flesh",
        "Meshuggah — Bleed"
    )

    companion object {

        const val TAG = "MetalMusic"

        // при скоупе singleton будет вызываться единожды и каждый getBean будет возвращать тот же объект
        @JvmStatic
        fun getMetalMusic() = MetalMusic()
    }
}