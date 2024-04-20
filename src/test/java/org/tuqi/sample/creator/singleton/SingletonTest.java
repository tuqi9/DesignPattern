package org.tuqi.sample.creator.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testLOLGame(){
        LOLGame lolGame1 = LOLGame.threadSafeStartClient();
        LOLGame lolGame2 = LOLGame.threadSafeStartClient();
        assertEquals(lolGame1, lolGame2);

        //  only log once Start LOL...
        LOLGame game = lolGame1;
        game.displayClient();
        game = lolGame2;
        game.selectLegends();
    }

    @Test
    public void testAdvanceSingleton(){
        AdvanceSingleton instance1 = AdvanceSingleton.getInstance();
        AdvanceSingleton instance2 = AdvanceSingleton.getInstance();
        assertEquals(instance1, instance2);
    }

}