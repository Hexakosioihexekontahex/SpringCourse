package com.hex.springcourse

import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val musicPlayerBean: MusicPlayer = context.getBean("musicPlayerBean", MusicPlayer::class.java)
        println("Player name: ${musicPlayerBean.getName()}")
        println("Volume is ${musicPlayerBean.getVolume()}")
        musicPlayerBean.playMusic()
        context.close()
    }
}