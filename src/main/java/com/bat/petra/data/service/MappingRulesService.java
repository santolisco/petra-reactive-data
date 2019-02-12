package com.bat.petra.data.service;

import com.bat.petra.data.repository.MappingRulesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MappingRulesService {

    @Autowired
    MappingRulesRepository mappingRulesRepository;


    public String getTargetValue(String entity, String field, String value, String type) {
        return mappingRulesRepository.getTargetValue(entity, field, value);
    }
}
