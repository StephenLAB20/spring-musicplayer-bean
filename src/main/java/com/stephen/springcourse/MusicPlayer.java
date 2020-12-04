package com.stephen.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private TranceMusic tranceMusic;
    private String name;
    private int volume;

    // empty constructor for spring
    public MusicPlayer() {
    }

    // our constructor
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, TranceMusic tranceMusic) {

        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.tranceMusic = tranceMusic;
    }

    public void playMusic(MusicGenre musicGenre) {

        int random = new Random().nextInt(3);

        switch (musicGenre) {
            case CLASSICAL:
                System.out.println(classicalMusic.getSongs().get(random));
                break;
            case ROCK:
                System.out.println(rockMusic.getSongs().get(random));
                break;
            case TRANCE:
                System.out.println(tranceMusic.getSongs().get(random));
                break;
            default:
                System.out.println("Wrong genre is selected.");
        }
    }

    public void doMyInit() {
        System.out.println("Bean's initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Bean's destruction");
    }

    public void showProperties() {
        System.out.println("Player: " + name + " | Volume: " + volume);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
