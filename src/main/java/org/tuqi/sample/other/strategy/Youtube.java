package org.tuqi.sample.other.strategy;

public class Youtube implements MusicPlayer{

    @Override
    public void playMusic(String name) {
        System.out.println("Youtube will play the music named " + name);
    }
}
