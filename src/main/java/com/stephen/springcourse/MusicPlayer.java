package com.stephen.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Autowired
    private List<Music> musicList = new ArrayList<>();

    // empty constructor for spring
    public MusicPlayer() {
    }

    public void playMusic() {

        int randomGenre = new Random().nextInt(musicList.size());
        Music genre = musicList.get(randomGenre);
        int randomSong = new Random().nextInt(genre.getSongs().size());
        String genreName = genre.getGenre();
        String song = genre.getSongs().get(randomSong);

        System.out.println("Genre: " + genreName + " | song: " + song);
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
