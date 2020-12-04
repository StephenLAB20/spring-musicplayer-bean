package com.stephen.springcourse.genre;

import com.stephen.springcourse.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();
    {
        songs.add("Classic Music 1");
        songs.add("Classic Music 2");
        songs.add("Classic Music 3");
    }

    @Override
    public String getGenre() {
        return "Classical Music";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
