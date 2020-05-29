package com.sitesh.assessment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sitesh.assessment.model.UserFeature;

public interface FeatureRepository extends JpaRepository<UserFeature, Integer> {

    public UserFeature findByEmailAndFeatureName(String email, String featureName);
}
