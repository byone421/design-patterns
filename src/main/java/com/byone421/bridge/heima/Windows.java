package com.byone421.bridge.heima;

public class Windows extends OperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decodeFile(fileName);
    }
}
