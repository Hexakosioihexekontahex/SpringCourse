package com.hex.springcourse

import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val musicBean: Music = context.getBean("musicBean", Music::class.java)
        MusicPlayer(musicBean).playMusic()
        context.close()
    }
}