package com.cursor.musicplayer;

import org.springframework.stereotype.Component;

import java.util.List;
@Component("musicPlayer")
public class MusicPlayer {

    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {

        this.musicList = musicList;
    }


    public void playRockMusic(){

        musicList.get(0).playSongs();

    }

    public void playClassicalMusic(){

        musicList.get(1).playSongs();
    }
}
