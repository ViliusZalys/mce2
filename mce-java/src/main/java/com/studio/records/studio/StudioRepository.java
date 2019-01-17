package com.studio.records.studio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudioRepository extends JpaRepository <Studio, Long>{

    Studio findStudioByStudioTitle(String studioTitle);
    void deleteStudioByStudioTitle(String studioTitle);

}
