package org.tuqi.sample.other.strategy;

public class MusicContext implements MusicPlayer{

    private MusicPlayer musicPlayer;

    public MusicContext(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public MusicContext(String musicPlayer) {
        switch (musicPlayer) {
            case "netease":
                this.musicPlayer = new Netease();
                break;
            case "spotify":
                this.musicPlayer = new Spotify();
                break;
            default:
                this.musicPlayer = new Youtube();
        }
    }

    @Override
    public void playMusic(String name) {
        musicPlayer.playMusic(name);
    }
}
