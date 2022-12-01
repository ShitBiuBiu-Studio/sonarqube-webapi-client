package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Update GitHub ALM instance Setting. Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class UpdateGithubService extends
    AbstractService<UpdateGithubService, Boolean> {

    public UpdateGithubService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"appId", "clientId", "key", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/update_github");
        return true;
    }

    /**
     * GitHub API ID
     *
     * @param appId appId
     * @return UpdateGithubService
     */
    public UpdateGithubService appId(String appId) {
        return put("appId", appId);
    }

    /**
     * GitHub App Client ID
     *
     * @param clientId clientId
     * @return UpdateGithubService
     */
    public UpdateGithubService clientId(String clientId) {
        return put("clientId", clientId);
    }

    /**
     * GitHub App Client Secret
     *
     * @param clientSecret clientSecret
     * @return UpdateGithubService
     */
    public UpdateGithubService clientSecret(String clientSecret) {
        return put("clientSecret", clientSecret);
    }

    /**
     * Unique key of the GitHub instance setting
     *
     * @param key key
     * @return UpdateGithubService
     */
    public UpdateGithubService key(String key) {
        return put("key", key);
    }

    /**
     * Optional new value for an unique key of the GitHub instance setting
     *
     * @param newKey newKey
     * @return UpdateGithubService
     */
    public UpdateGithubService newKey(String newKey) {
        return put("newKey", newKey);
    }

    /**
     * GitHub App private key
     *
     * @param privateKey privateKey
     * @return UpdateGithubService
     */
    public UpdateGithubService privateKey(String privateKey) {
        return put("privateKey", privateKey);
    }

    /**
     * GitHub API URL
     *
     * @param url url
     * @return UpdateGithubService
     */
    public UpdateGithubService url(String url) {
        return put("url", url);
    }


}
