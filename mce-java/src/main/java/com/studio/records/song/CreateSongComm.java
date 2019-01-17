package com.studio.records.song;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class CreateSongComm {
    @NotNull
    @Length(min=1, max=100)
    private String songTitle;
    @NotNull
    @Length(min=1, max=100)
    private String album;
    @NotNull
    @Length(min=1, max=10)
    private long length;
    @NotNull
    @Length(min = 0, max = 50)
    private String mp3file;

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
