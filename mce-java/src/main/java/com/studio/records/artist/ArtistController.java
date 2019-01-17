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
        return artistService.findStudioByStudioTitle()studioService.findStudioByStudioTitle(studioTitle);

    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value="Create studio", notes="Creates new studio")
    public void createStudio(@ApiParam(value="studio data", required=true)
                             @Valid
                             @RequestBody final CreateStudioComm p) {
        studioService.createStudio(p.getStudioTitle(), p.getLogo(), p.getCategory(), p.getSize());
    }

    @RequestMapping(path="/{studioTitle}",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value="Edit studio",notes="Change studio data")
    public void updateStudio(
            @ApiParam(value="Studio title",required=true)
            @Valid
            @PathVariable final String title,
            @ApiParam(value="Studio data",required=true)
            @Valid
            @RequestBody final CreateStudioComm p) {

        studioService.updateStudio(title, p.getStudioTitle(), p.getLogo(), p.getCategory(), p.getSize());
    }

    @RequestMapping(path = "/{studioTitle}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value="Delete studio", notes="Deletes certain studio")
    public void deleteStudio(@ApiParam(value="Studio title", required=true)
                             @Valid
                             @PathVariable final String studioTitle) {

        studioService.deleteStudio(studioTitle);

    }

}
