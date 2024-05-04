package org.tuqi.sample.other.strategy;

public class Spotify implements MusicPlayer {

    @Override
    public void playMusic(String name) {
        System.out.println("Spotify will play the music named " + name);
    }
}
