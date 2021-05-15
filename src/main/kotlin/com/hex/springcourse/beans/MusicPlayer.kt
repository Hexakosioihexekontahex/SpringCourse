package com.hex.springcourse.beans

import com.hex.springcourse.beans.music.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.lang.Math.random
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
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

    @Value("\${musicPlayer.name}")
    private lateinit var name: String

    @Value("\${musicPlayer.volume}")
    private var volume: Int = 0

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name

    fun setVolume(volume: Int) {
        this.volume = volume
    }

    fun getVolume() = volume

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

    fun turnOff() {
        println("${getName()} turned off")
    }
}