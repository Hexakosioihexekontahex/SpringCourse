package com.hex.springcourse

import org.springframework.context.support.ClassPathXmlApplicationContext

object TestSpring {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = ClassPathXmlApplicationContext("applicationContext.xml")
        val testBean: TestBean = context.getBean("testBean", TestBean::class.java)
        println(testBean.name)
        context.close()
    }
}