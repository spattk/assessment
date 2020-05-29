package com.sitesh.assessment.model;

public class FeatureResponse {
    private boolean canAccess;

    public FeatureResponse(boolean canAccess) {
        this.canAccess = canAccess;
    }

    public boolean isCanAccess() {
        return canAccess;
    }

    public void setCanAccess(boolean canAccess) {
        this.canAccess = canAccess;
    }
}
