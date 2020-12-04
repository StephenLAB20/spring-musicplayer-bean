package com.stephen.springcourse.genre;

import com.stephen.springcourse.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {

    private List<String> songs = new ArrayList<>();
    {
        songs.add("Jazz Music 1");
        songs.add("Jazz Music 2");
        songs.add("Jazz Music 3");
        songs.add("Jazz Music 4");
        songs.add("Jazz Music 5");
        songs.add("Jazz Music 6");
        songs.add("Jazz Music 7");
    }

    @Override
    public String getGenre() {
        return "Jazz Music";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
