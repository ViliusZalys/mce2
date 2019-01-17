package com.studio.records.artist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;


    @Transactional(readOnly=true)
    public List<ArtistRestResp> getAllArtists () {


        return artistRepository.findAll().stream().map(
                (artist) ->
                        new ArtistRestResp(
                                artist.getPseudonym(),
                                artist.getFirstname(),
                                artist.getSurname(),
                                artist.getGenre(),
                                artist.getCountry(),
                                artist.getDateOfBirth(),
                                artist.getPhoto()
                .colle

    }

    @Transactional
    public ArtistRestResp findArtistByPseudonym(String pseudonym) {
        Artist artist = artistRepository.findArtistByPseudonym(pseudonym);
        return new ArtistRestResp(artist.getPseudonym(),
                artist.getFirstname(),
                artist.getSurname(),
                artist.getGenre(),
                artist.getCountry(),
                artist.getDateOfBirth(),
                artist.getPhoto();
    }

    @Transactional
    public void addArtist(String pseudonyme, String firstName, String surname, String genre, String country, String dateOfBirth, String photo) {

        artistRepository.save(artist);
    }


    @Transactional
    public void deleteArtist(String pseudonym) {
        artistRepository.deleteArtistByPseudonym(pseudonym);
    }

    public ArtistRepository getArtistRepository() {
        return artistRepository;
    }

    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }


    @Transactional
    public void updateArtist(String newPseu, String pseudonyme, String firstName, String surname, String genre, String country, String dateOfBirth, String photo) {
        Artist Studio studioUpdate = studioRepository.findStudioByStudioTitle(newTitle);
        studioUpdate.setTitle(studioTitle);
        studioUpdate.setLogo(logo);
        studioUpdate.setCategory(category);
        studioUpdate.setSize(size);
        studioRepository.save(studioUpdate);
    }

}
