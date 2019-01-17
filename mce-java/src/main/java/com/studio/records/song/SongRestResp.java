package com.studio.records.song;

public class SongRestResp {
    private String songTitle;
    private String album;
    private long length;
    private String mp3file;


    public SongRestResp (String songTitle, String album, long length, String mp3file){
        this.songTitle = songTitle;
        this.album = album;
        this.length = length;
        this.mp3file = mp3file;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getMp3file() {
        return mp3file;
    }

    public void setMp3file(String mp3file) {
        this.mp3file = mp3file;
    }
}
