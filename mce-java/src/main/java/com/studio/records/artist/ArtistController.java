package com.studio.records.artist;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "artist")
@RequestMapping(value = "/api/artists")
public class ArtistController {
    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get artists", notes="Returns all artists")
    public List<ArtistRestResp> getAllArtists() {
        return artistService.getAllArtists();
    }

    @RequestMapping(path="/{pseaudonym}",method = RequestMethod.GET)
    @ApiOperation(value="Get pseudonym", notes="Returns one artist pseudonym")
    public ArtistRestResp getArtist(@ApiParam(value="Artist pseudonym", required=true)
                                    @Valid
                                    @PathVariable String pseudonym) {
        return artistService.findArtistByPseudonym(pseudonym);

    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value="Create artist", notes="Creates new artist")
    public void createArtist(@ApiParam(value="artist data", required=true)
                             @Valid
                             @RequestBody final CreateArtistComm p) {
        artistService.addArtist(p.getPseudonyme(), p.getFirstName(), p.getSurname(), p.getGenre(), p.getCountry(), p.getPhoto());
    }

    @RequestMapping(path="/{pseudonym}",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value="Edit pseudonym",notes="Change artist data")
    public void updateArtist(
            @ApiParam(value="Pseudonym",required=true)
            @Valid
            @PathVariable final String title,
            @ApiParam(value="Artist data",required=true)
            @Valid
            @RequestBody final CreateArtistComm p) {

        artistService.updateArtist();
    }

    @RequestMapping(path = "/{pseudonym}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value="Delete studio", notes="Deletes certain studio")
    public void deleteStudio(@ApiParam(value="Studio title", required=true)
                             @Valid
                             @PathVariable final String studioTitle) {

        studioService.deleteStudio(studioTitle);

    }

}
