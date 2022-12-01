package com.geewaza.sonarqube.webapi.model.newcodeperiods;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-11-02 15:07
 **/
public class NewCodePeriod {

    private String projectKey;

    private String branchKey;

    private String type;

    private String value;

    private String effectiveValue;

    private Boolean inherited;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBranchKey() {
        return branchKey;
    }

    public void setBranchKey(String branchKey) {
        this.branchKey = branchKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEffectiveValue() {
        return effectiveValue;
    }

    public void setEffectiveValue(String effectiveValue) {
        this.effectiveValue = effectiveValue;
    }

    public Boolean getInherited() {
        return inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }
}
