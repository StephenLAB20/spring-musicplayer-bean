package com.stephen.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

//    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    // empty constructor for spring // or remove your constructor if no needed
    public MusicPlayer() {}

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music song: musicList) {
            System.out.println("Playing: " + song.getSong());
        }
    }

    public void showProperties() {
        System.out.println("Player: " + name + " | Volume: " + volume);
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
