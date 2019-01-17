package com.studio.records.song;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    Song findSongBySongTitle(String songTitle);
    void deleteSongBySongTitle(String songTitle);
}
