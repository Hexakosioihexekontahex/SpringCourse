package com.hex.springcourse

import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val classicalMusic: Music = context.getBean("classicalMusic", ClassicalMusic::class.java)
        val rockMusic: Music = context.getBean("rockMusic", RockMusic::class.java)
        val metalMusic: Music = context.getBean("metalMusic", MetalMusic::class.java)
        with (context.getBean("musicPlayer", MusicPlayer::class.java)) {
            setVolume(95)
            setName("MyPlayer")
            setMusicList(listOf(classicalMusic, rockMusic, metalMusic))
            playMusic()
        }
        context.close()
    }
}