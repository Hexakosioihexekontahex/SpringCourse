package com.hex.springcourse

import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val firstMusicPlayerBean: MusicPlayer = context.getBean("musicPlayerBean", MusicPlayer::class.java)
        val secondMusicPlayerBean: MusicPlayer = context.getBean("musicPlayerBean", MusicPlayer::class.java)

        val comparison = firstMusicPlayerBean == secondMusicPlayerBean
        println("Players are equal: $comparison ($firstMusicPlayerBean/$secondMusicPlayerBean)") // true when scope singleton
        firstMusicPlayerBean.setVolume(80)
        println(secondMusicPlayerBean.getVolume()) // 80 when scope singleton
//        println("Player name: ${musicPlayerBean.getName()}")
//        println("Volume is ${musicPlayerBean.getVolume()}")
//        musicPlayerBean.playMusic()
        context.close()
    }
}