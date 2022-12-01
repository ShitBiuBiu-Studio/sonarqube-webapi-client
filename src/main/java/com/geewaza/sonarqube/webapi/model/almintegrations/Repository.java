package com.geewaza.sonarqube.webapi.model.almintegrations;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 09:35
 **/
public class Repository {

    private String id;

    private String name;

    private String plug;

    private String pathSlug;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlug() {
        return plug;
    }

    public void setPlug(String plug) {
        this.plug = plug;
    }

    public String getPathSlug() {
        return pathSlug;
    }

    public void setPathSlug(String pathSlug) {
        this.pathSlug = pathSlug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
