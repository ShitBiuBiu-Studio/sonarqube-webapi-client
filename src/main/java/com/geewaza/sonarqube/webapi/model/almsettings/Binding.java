package com.geewaza.sonarqube.webapi.model.almsettings;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 10:00
 **/
public class Binding {

    private String key;

    private String alm;

    private String repository;

    private String url;

    private Boolean summaryCommentEnabled;

    private Boolean monorepo;

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

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getSummaryCommentEnabled() {
        return summaryCommentEnabled;
    }

    public void setSummaryCommentEnabled(Boolean summaryCommentEnabled) {
        this.summaryCommentEnabled = summaryCommentEnabled;
    }

    public Boolean getMonorepo() {
        return monorepo;
    }

    public void setMonorepo(Boolean monorepo) {
        this.monorepo = monorepo;
    }
}
