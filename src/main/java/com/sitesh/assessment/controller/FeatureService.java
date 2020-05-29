package com.sitesh.assessment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sitesh.assessment.model.FeatureResponse;
import com.sitesh.assessment.model.UserFeature;

@RestController
public interface FeatureService {

    @PostMapping("/feature")
    public ResponseEntity saveUserFeature(@RequestBody UserFeature userFeature);

    @GetMapping("/feature")
    public FeatureResponse getUserFeature(@RequestParam String email, @RequestParam String featureName);
}
