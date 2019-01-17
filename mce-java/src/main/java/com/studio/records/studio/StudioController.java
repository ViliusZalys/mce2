package com.studio.records.studio;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "studio")
@RequestMapping(value = "/api/studios")
public class StudioController {

    private final StudioService studioService;;

    @Autowired
    public StudioController(StudioService studioService) {
        this.studioService = studioService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get studios", notes="Returns all studios")
    public List<StudioRestResp> getAllStudios() {
        return studioService.getAllStudios();
    }

    @RequestMapping(path="/{studioTitle}",method = RequestMethod.GET)
    @ApiOperation(value="Get studio", notes="Returns one studio")
    public StudioRestResp getStudio(@ApiParam(value="Studio title", required=true)
                                       @Valid
                                       @PathVariable String studioTitle) {
        return studioService.findStudioByStudioTitle(studioTitle);

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
