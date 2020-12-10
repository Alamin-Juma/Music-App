package com.example.recycleviewer;

public class Music {
    //name of the singer
    private String singerName;

    //name of the song
    private String songName;

    //Drawable resource ID
    private int mImageResourceId;

    //a constructor to create an object of music
    public Music(String singerName, String songName, int mImageResourceId) {
        this.singerName = singerName;
        this.songName = songName;
        this.mImageResourceId = mImageResourceId;
    }

    //get the name of the singer
    public String getSingerName() {
        return singerName;
    }

    //get the name of the song
    public String getSongName() {
        return songName;
    }

    //get the name of the image resource
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}