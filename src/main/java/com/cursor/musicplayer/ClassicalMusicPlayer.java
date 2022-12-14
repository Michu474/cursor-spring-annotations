package com.cursor.musicplayer;

import com.cursor.musicplayer.tracks.ClassicalTrack1;
import com.cursor.musicplayer.tracks.ClassicalTrack2;
import com.cursor.musicplayer.tracks.Track;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component("classicalMusic")
public class ClassicalMusicPlayer implements Music{

    ArrayList<Track> trackList = new ArrayList<>();

    public ClassicalMusicPlayer() {

        trackList.add(new ClassicalTrack1());
        trackList.add(new ClassicalTrack2());
    }


    public void playSongs(){
        for(Track track:trackList){
            System.out.println(track.getSongName()+" "+track.getAuthor());
        }
    }
}


