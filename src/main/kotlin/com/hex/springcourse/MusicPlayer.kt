package com.hex.springcourse

class MusicPlayer() {
    private var musicList: List<Music>? = null
    private var name: String? = null
    private var volume: Int? = null

    constructor(musicList: List<Music>) : this() {
        this.musicList = musicList
    }

    fun setMusicList(musicList: List<Music>) {
        this.musicList = musicList
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name ?: "null"

    fun setVolume(volume: Int) {
        this.volume = volume
    }

    fun getVolume() = volume ?: 0

    fun playMusic() {
        musicList?.forEach { music ->
            println("Playing: ${music.getSongTitle()}")
        }
    }
}