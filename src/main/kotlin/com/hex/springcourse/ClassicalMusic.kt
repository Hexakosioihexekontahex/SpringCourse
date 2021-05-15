package com.hex.springcourse

import org.springframework.stereotype.Component

@Component
class ClassicalMusic private constructor() : Music {

    override fun getSongTitle(): String {
        return "Hungarian Rhapsody"
    }

    companion object {

        // при скоупе singleton будет вызываться единожды и каждый getBean будет возвращать тот же объект
        @JvmStatic
        fun getClassicalMusic() = ClassicalMusic()
    }
}