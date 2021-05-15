package com.hex.springcourse

class MetalMusic private constructor() : Music {

    override fun getSongTitle() = "Blasphemian"

    companion object {

        // при скоупе singleton будет вызываться единожды и каждый getBean будет возвращать тот же объект
        @JvmStatic
        fun getMetalMusic() = MetalMusic()
    }
}