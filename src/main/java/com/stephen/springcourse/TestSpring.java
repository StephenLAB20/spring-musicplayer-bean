package com.stephen.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.showProperties();
        musicPlayer.playMusic(MusicGenre.TRANCE);

        context.close();
    }
}
