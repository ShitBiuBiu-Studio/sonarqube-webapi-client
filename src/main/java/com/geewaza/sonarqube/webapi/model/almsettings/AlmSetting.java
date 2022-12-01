package com.geewaza.sonarqube.webapi.model.almsettings;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 10:05
 **/
public class AlmSetting {

    private String key;

    private String alm;

    private String url;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAlm() {
        return alm;
    }

    public void setAlm(String alm) {
        this.alm = alm;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
