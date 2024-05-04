package org.tuqi.sample.other.strategy;

public class Main {
    public static void main(String[] args) {
        //  不使用简单工厂模式实现的策略模式
        MusicPlayer netease = new MusicContext("netease");
        netease.playMusic("makeba");

        MusicPlayer youtube = new MusicContext("youtube");
        youtube.playMusic("miracle in the middle of my heart");

        MusicPlayer spotify = new MusicContext("spotify");
        spotify.playMusic("a new day has come");

    }

}
