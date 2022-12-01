package com.geewaza.sonarqube.webapi.model.almsettings;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-11-16 20:10
 **/
public class CountBinding {

    private String key;

    private Integer projects;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getProjects() {
        return projects;
    }

    public void setProjects(Integer projects) {
        this.projects = projects;
    }
}
