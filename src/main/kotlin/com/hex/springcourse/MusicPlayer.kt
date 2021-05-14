package com.hex.springcourse

class MusicPlayer(private val music: Music) {

    fun playMusic() {
        println("Playing: ${music.getSongTitle()}")
    }
}