package com.hex.springcourse

import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val musicPlayerBean: MusicPlayer = context.getBean("musicPlayerBean", MusicPlayer::class.java)
        musicPlayerBean.playMusic()
//        println(musicPlayerBean.music == context.getBean("musicBean", Music::class.java)) // true
        context.close()
    }
}