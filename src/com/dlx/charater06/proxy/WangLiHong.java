package com.dlx.charater06.proxy;

public class WangLiHong implements Singer{
    @Override
    public void orderSong(String songName) {
        // TODO Auto-generated method stub
        System.out.println("演唱歌曲："+songName);
    }

    @Override
    public void sayGoodBye(String audienceName) {
        // TODO Auto-generated method stub
        System.out.println("再见："+audienceName);
    }
}
