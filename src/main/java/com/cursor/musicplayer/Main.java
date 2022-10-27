package com.cursor.musicplayer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);

        musicPlayer.playClassicalMusic();
        System.out.println("\n");
        musicPlayer.playRockMusic();


    }
}