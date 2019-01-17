package com.studio.records.studio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class StudioService {

    @Autowired
    private StudioRepository studioRepository;

    @Transactional(readOnly=true)
    public List<StudioRestResp> getAllStudios () {


        return studioRepository.findAll().stream().map(
                (studio) ->
                        new StudioRestResp(
                                studio.getTitle(),
                                studio.getLogo(),
                                studio.getCategory(),
                                studio.getSize()))

                .collect(Collectors.toList());

    }

    @Transactional
    public StudioRestResp findStudioByStudioTitle(String studioTitle) {
        Studio studio = studioRepository.findStudioByStudioTitle(studioTitle);
        return new StudioRestResp(studio.getTitle(),
                studio.getLogo(),
                studio.getCategory(),
                studio.getSize());
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
