package com.hex.springcourse

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class MusicPlayer {
    @Autowired
    private lateinit var classicalMusic: ClassicalMusic
    @Autowired
    private lateinit var rockMusic: RockMusic
    @Autowired
    private lateinit var metalMusic: MetalMusic

    private lateinit var musicList: List<Music>
    private var name: String? = null
    private var volume: Int? = null

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name ?: "null"

    fun setVolume(volume: Int) {
        this.volume = volume
    }

    fun getVolume() = volume ?: 0

    fun playMusic() {
        println("Player name: ${this.getName()}")
        println("Volume is ${this.getVolume()}")
        musicList.forEach { music ->
            println("Playing: ${music.getSongTitle()}")
        }
    }

    @PostConstruct
    private fun createMusicList() {
        musicList = listOf(classicalMusic, rockMusic, metalMusic)
    }
}