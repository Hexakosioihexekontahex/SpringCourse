package com.hex.springcourse.beans

import com.hex.springcourse.beans.music.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import java.lang.Math.random
import javax.annotation.PostConstruct

@Component
class MusicPlayer {

    @Autowired
    @Qualifier(ClassicalMusic.TAG)
    private lateinit var classicalMusic: Music

    @Autowired
    @Qualifier(RockMusic.TAG)
    private lateinit var rockMusic: Music

    @Autowired
    @Qualifier(MetalMusic.TAG)
    private lateinit var metalMusic: Music

    private lateinit var music: Map<MusicGenre, Music>
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

    fun playMusic(genre: MusicGenre) {
        println("Player name: ${this.getName()}")
        println("Volume is ${this.getVolume()}")
        (random() * (music[genre]?.getSongs()?.size ?: 0)).toInt().let { index ->
            println("Playing: ${music[genre]?.getSongs()?.get(index)}")
        }
    }

    @PostConstruct
    private fun createMusicList() {
        music = mapOf(
            MusicGenre.CLASSICAL to classicalMusic,
            MusicGenre.ROCK to rockMusic,
            MusicGenre.METAL to metalMusic
        )
    }
}