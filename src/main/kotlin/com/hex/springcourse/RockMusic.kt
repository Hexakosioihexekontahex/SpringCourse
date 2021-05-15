package com.hex.springcourse

class RockMusic private constructor() : Music {

    override fun getSongTitle(): String {
        return "Wind cries Mary"
    }

    companion object {

        // при скоупе singleton будет вызываться единожды и каждый getBean будет возвращать тот же объект
        @JvmStatic
        fun getRockMusic() = RockMusic()
    }
}