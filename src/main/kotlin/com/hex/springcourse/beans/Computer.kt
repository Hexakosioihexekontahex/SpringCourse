package com.hex.springcourse.beans

import com.hex.springcourse.beans.music.MusicGenre
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
        musicPlayer.playMusic(MusicGenre.CLASSICAL)
    }

    @PreDestroy
    private fun preDestroy() {
        println("Turning off...")
    }
}