package org.tuqi.sample.other.strategy;

public class Netease implements MusicPlayer{

    @Override
    public void playMusic(String name) {
        System.out.println("Netease will play the music named " + name);
    }
}
