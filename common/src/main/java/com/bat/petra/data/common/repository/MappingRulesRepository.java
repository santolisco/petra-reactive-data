package com.bat.petra.data.common.repository;

import com.bat.petra.data.common.model.MappingRules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MappingRulesRepository extends JpaRepository<MappingRules, Long> {

    @Query("SELECT c.value FROM MappingRules c WHERE c.key = ?1")
    String getTargetValue(String targetentity, String targetfield, String type);
}
