package com.sitesh.assessment.service;

import com.sitesh.assessment.model.UserFeature;
import com.sitesh.assessment.controller.FeatureService;
import com.sitesh.assessment.dao.FeatureRepository;
import com.sitesh.assessment.model.FeatureResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class FeatureServiceImpl implements FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

    @Override
    public ResponseEntity saveUserFeature(UserFeature userFeature) {

        try {
            featureRepository.save(userFeature);
        }
        catch (Exception e) {
            return new ResponseEntity(HttpStatus.NOT_MODIFIED);
        }

        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public FeatureResponse getUserFeature(String email, String featureName) {
        UserFeature userFeature =  featureRepository.findByEmailAndFeatureName(email, featureName);
        FeatureResponse featureResponse = new FeatureResponse(false);
        if (userFeature != null) {
            featureResponse.setCanAccess(userFeature.isEnable());
        }
        return featureResponse;
    }
}
