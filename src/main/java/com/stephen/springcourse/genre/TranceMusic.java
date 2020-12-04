package com.stephen.springcourse.genre;

import com.stephen.springcourse.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TranceMusic implements Music {

    private List<String> songs = new ArrayList<>();
    {
        songs.add("Trance Music 1");
        songs.add("Trance Music 2");
        songs.add("Trance Music 3");
    }


    @Override
    public String getGenre() {
        return "Trance Music";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
