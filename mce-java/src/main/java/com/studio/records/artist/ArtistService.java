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
    public void createStudio(String studioTitle,String logo, String category, String size) {
        Studio studio = new Studio(studioTitle,logo, category, size);

        studioRepository.save(studio);
    }


    @Transactional
    public void deleteStudio(String studioTitle) {
        studioRepository.deleteStudioByStudioTitle(studioTitle);
    }

    public StudioRepository getStudioRepository() {
        return studioRepository;
    }

    public void setStudioRepository(StudioRepository studioRepository) {
        this.studioRepository = studioRepository;
    }


    @Transactional
    public void updateStudio(String newTitle, String studioTitle, String logo, String category, String size) {
        Studio studioUpdate = studioRepository.findStudioByStudioTitle(newTitle);
        studioUpdate.setTitle(studioTitle);
        studioUpdate.setLogo(logo);
        studioUpdate.setCategory(category);
        studioUpdate.setSize(size);
        studioRepository.save(studioUpdate);
    }

}
