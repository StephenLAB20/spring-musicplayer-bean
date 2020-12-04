package com.stephen.springcourse;

import com.stephen.springcourse.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.showProperties();
        musicPlayer.playMusic();

        context.close();
    }
}
