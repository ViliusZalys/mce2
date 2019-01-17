package com.studio.records.artist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Artist findArtistByPseudonym(String pseudonym);
    void deleteArtistByPseudonym(String pseudonym);
}
