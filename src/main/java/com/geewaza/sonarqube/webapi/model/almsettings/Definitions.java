package com.geewaza.sonarqube.webapi.model.almsettings;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 10:08
 **/
public class Definitions {

    private Definition[] github;

    private Definition[] azure;

    private Definition[] bitbucket;

    private Definition[] gitlab;

    private Definition[] bitbucketcloud;

    public Definition[] getGithub() {
        return github;
    }

    public void setGithub(Definition[] github) {
        this.github = github;
    }

    public Definition[] getAzure() {
        return azure;
    }

    public void setAzure(Definition[] azure) {
        this.azure = azure;
    }

    public Definition[] getBitbucket() {
        return bitbucket;
    }

    public void setBitbucket(Definition[] bitbucket) {
        this.bitbucket = bitbucket;
    }

    public Definition[] getGitlab() {
        return gitlab;
    }

    public void setGitlab(Definition[] gitlab) {
        this.gitlab = gitlab;
    }

    public Definition[] getBitbucketcloud() {
        return bitbucketcloud;
    }

    public void setBitbucketcloud(Definition[] bitbucketcloud) {
        this.bitbucketcloud = bitbucketcloud;
    }
}
