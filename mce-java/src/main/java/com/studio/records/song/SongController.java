package com.studio.records.song;

import com.studio.records.studio.CreateStudioComm;
import com.studio.records.studio.StudioRestResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "song")
@RequestMapping(value = "/api/song")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get songs", notes="Returns all songs")
    public List<SongRestResp> getAllSongs() {
        return songService.getAllSongs();
    }

    @RequestMapping(path="/{songTitle}",method = RequestMethod.GET)
    @ApiOperation(value="Get song", notes="Returns one certain song")
    public SongRestResp getSong(@ApiParam(value="Song title", required=true)
                                    @Valid
                                    @PathVariable String songTitle) {
        return songService.findSongBySongTitle(songTitle);

    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value="Create song", notes="Creates new songs")
    public void createSong(@ApiParam(value="song data", required=true)
                             @Valid
                             @RequestBody final CreateSongComm p) {
        songService.createSong(p.getSongTitle(), p.getAlbum(), p.getLength(), p.getMp3file());
    }



    @RequestMapping(path = "/{songTitle}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value="Delete song", notes="Deletes certain song")
    public void deleteSong(@ApiParam(value="Song title", required=true)
                             @Valid
                             @PathVariable final String songTitle) {

        songService.deleteSong(songTitle);

    }
}
