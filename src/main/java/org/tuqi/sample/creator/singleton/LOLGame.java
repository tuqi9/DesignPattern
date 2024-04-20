package org.tuqi.sample.creator.singleton;

public class LOLGame {

    /**
     * 懒汉式（需要volatile保证可见性）
     */
    private volatile static LOLGame process;

    /**
     * 饿汉式
     */
    private static LOLGame process2 = new LOLGame();

    private LOLGame(){
        System.out.println("Start LOL...");
    }

    public static LOLGame unsafeThreadStartClient() {
        if (process == null) {
            process = new LOLGame();
        }
        return process;
    }

    public static LOLGame threadSafeStartClient() {
        // 双重检查
        // 第一重检查为了保证性能
        if (process == null) {

            synchronized (LOLGame.class) {
                // 第二重检查为了保证线程安全 p.s.需要与volatile组合使用
                if (process == null) {
                    process = new LOLGame();
                }
            }
        }
        return process;
    }

    public void selectLegends(){
        System.out.println("Select YaSuo.");
    }

    public void displayClient(){
        System.out.println("Display the LOL client..");
    }
}
