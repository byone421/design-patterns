package com.byone421.bridge.heima;

public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile){
        this.videoFile = videoFile;
    }



    public abstract void play(String fileName);

}
