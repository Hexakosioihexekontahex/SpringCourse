package com.hex.springcourse.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ComponentScan("com.hex.springcourse.beans")
@PropertySource("classpath:musicPlayer.properties")
class SpringConfig {

    /*
    @Bean
    fun classicalMusic() = ClassicalMusic.getClassicalMusic()
    @Bean
    fun rockMusic() = RockMusic.getRockMusic()
    @Bean
    fun metalMusic() = MetalMusic.getMetalMusic()
    @Bean
    fun musicPlayer() = MusicPlayer(classicalMusic(), rockMusic(), metalMusic())
    @Bean
    fun computer() = Computer(musicPlayer())
    */
}
