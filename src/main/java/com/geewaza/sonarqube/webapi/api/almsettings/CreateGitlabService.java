package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Create GitLab ALM instance Setting.
 * Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class CreateGitlabService extends
    AbstractService<CreateGitlabService, Boolean> {

    public CreateGitlabService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key", "personalAccessToken", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/create_gitlab");
        return true;
    }


    /**
     * Unique key of the GitLab instance setting
     *
     * @param key key
     * @return CreateGitlabService
     */
    public CreateGitlabService key(String key) {
        return put("key", key);
    }

    /**
     * GitLab personal access token
     *
     * @param personalAccessToken personalAccessToken
     * @return CreateGitlabService
     */
    public CreateGitlabService personalAccessToken(String personalAccessToken) {
        return put("personalAccessToken", personalAccessToken);
    }

    /**
     * GitLab API URL
     *
     * @param url url
     * @return CreateGitlabService
     */
    public CreateGitlabService url(String url) {
        return put("url", url);
    }


}
