package com.hex.springcourse

import com.hex.springcourse.beans.Computer
import com.hex.springcourse.beans.MusicPlayer
import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val computer = context.getBean(Computer::class.java)
        computer.turnOn()
//        println(context.getBean(ClassicalMusic::class.java) == context.getBean(ClassicalMusic::class.java)) // true
        context.getBean(MusicPlayer::class.java).turnOff()
        context.close()
    }
}