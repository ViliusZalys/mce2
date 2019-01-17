package com.studio.records.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    @Transactional(readOnly=true)
    public List<SongRestResp> getAllSongs () {


        return songRepository.findAll().stream().map(
                (song) ->
                        new SongRestResp(
                                song.getSongTitle(),
                                song.getAlbum(),
                                song.getLength(),
                                song.getMp3file()))

                .collect(Collectors.toList());

    }

    @Transactional
    public SongRestResp findSongBySongTitle(String songTitle) {
        Song song = songRepository.findSongBySongTitle(songTitle);
        return new SongRestResp(song.getSongTitle(),
                song.getAlbum(),
                song.getLength(),
                song.getMp3file());
    }

    @Transactional
    public void createSong(String songTitle,String album, long length, String mp3file) {
        Song song = new Song(songTitle, album, length, mp3file);

        songRepository.save(song);
    }


    @Transactional
    public void deleteSong(String songTitle) {
        songRepository.deleteSongBySongTitle(songTitle);
    }

    public SongRepository getSongRepository() {
        return songRepository;
    }

    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }



}
