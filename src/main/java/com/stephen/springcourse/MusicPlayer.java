package com.stephen.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("singleton")
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
    public MusicPlayer(@Value("${musicPlayer.name}") String name, @Value("${musicPlayer.volume}") int volume,
                       ClassicalMusic classicalMusic, RockMusic rockMusic, TranceMusic tranceMusic) {

        this.name = name;
        this.volume = volume;
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

    @PostConstruct
    public void doMyInit() {
        System.out.println("Bean's initialisation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Bean's destruction");
    }

    public void showProperties() {
        System.out.println("Player: " + name + " | Volume: " + volume);
    }
}
