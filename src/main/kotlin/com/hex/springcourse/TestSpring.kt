package com.hex.springcourse

import com.hex.springcourse.beans.Computer
import com.hex.springcourse.beans.MusicPlayer
import com.hex.springcourse.config.SpringConfig
import org.springframework.context.annotation.AnnotationConfigApplicationContext

object TestSpring {

    @JvmStatic
    fun main(args: Array<String>) {
        val context = AnnotationConfigApplicationContext(SpringConfig::class.java)
        val computer = context.getBean(Computer::class.java)
        computer.turnOn()
        context.getBean(MusicPlayer::class.java).turnOff()
        context.close()
    }
}
