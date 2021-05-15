package com.hex.springcourse.beans

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import javax.annotation.PreDestroy

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class Computer {
    @Autowired lateinit var musicPlayer: MusicPlayer

    fun turnOn() {
        musicPlayer.playMusic()
    }

    @PreDestroy
    private fun preDestroy() {
        println("Turning off...")
    }
}
