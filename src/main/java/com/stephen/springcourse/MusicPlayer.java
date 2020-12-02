package com.stephen.springcourse;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;

    // empty constructor for spring // or remove your constructor if no needed

    public MusicPlayer() {}
    // IoC

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void showProperties() {
        System.out.println("Player: " + name + " Volume: " + volume);
    }

    public void setMusic(Music music) {
        this.music = music;
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
