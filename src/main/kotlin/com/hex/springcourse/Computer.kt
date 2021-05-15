package com.hex.springcourse

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Computer {
    @Autowired lateinit var musicPlayer: MusicPlayer

    fun turnOn() {
        musicPlayer.setVolume(70)
        musicPlayer.setName("MyPlayer")
        musicPlayer.playMusic()
    }
}