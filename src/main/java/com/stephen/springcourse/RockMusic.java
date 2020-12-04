package com.stephen.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();
    {
        songs.add("Rock Music 1");
        songs.add("Rock Music 2");
        songs.add("Rock Music 3");
    }

    @Override
    public String getGenre() {
        return "Rock Music";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
