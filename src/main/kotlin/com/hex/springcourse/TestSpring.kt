package com.hex.springcourse

import com.hex.springcourse.beans.Computer
import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val computer = context.getBean(Computer::class.java)
        computer.turnOn()
        context.close()
    }
}