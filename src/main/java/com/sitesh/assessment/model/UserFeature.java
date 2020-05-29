package com.sitesh.assessment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserFeature {
    @Id
    @GeneratedValue
    private int id;
    private String featureName;
    private String email;
    private boolean enable;

    public UserFeature() {
    }

    public UserFeature(int id, String featureName, String email, boolean enable) {
        this.id = id;
        this.featureName = featureName;
        this.email = email;
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
