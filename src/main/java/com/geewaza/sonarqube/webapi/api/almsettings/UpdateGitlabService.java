package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Update GitLab ALM instance Setting. Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class UpdateGitlabService extends
    AbstractService<UpdateGitlabService, Boolean> {

    public UpdateGitlabService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/update_gitlab");
        return true;
    }

    /**
     * Unique key of the GitLab instance setting
     *
     * @param key key
     * @return UpdateGitlabService
     */
    public UpdateGitlabService key(String key) {
        return put("key", key);
    }

    /**
     * Optional new value for an unique key of the GitLab instance setting
     *
     * @param newKey newKey
     * @return UpdateGitlabService
     */
    public UpdateGitlabService newKey(String newKey) {
        return put("newKey", newKey);
    }

    /**
     * GitLab personal access token
     *
     * @param personalAccessToken personalAccessToken
     * @return UpdateGitlabService
     */
    public UpdateGitlabService personalAccessToken(String personalAccessToken) {
        return put("personalAccessToken", personalAccessToken);
    }

    /**
     * GitLab API URL
     *
     * @param url url
     * @return UpdateGitlabService
     */
    public UpdateGitlabService url(String url) {
        return put("url", url);
    }
}
