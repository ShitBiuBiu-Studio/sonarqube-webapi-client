package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Create GitHub ALM instance Setting.
 * Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class CreateGithubService extends
    AbstractService<CreateGithubService, Boolean> {

    public CreateGithubService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"appId", "clientId", "clientSecret", "key", "privateKey", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/create_github");
        return true;
    }

    /**
     * GitHub App ID
     *
     * @param appId appId
     * @return CreateGithubService
     */
    public CreateGithubService appId(String appId) {
        return put("appId", appId);
    }

    /**
     * GitHub App Client ID
     *
     * @param clientId clientId
     * @return CreateGithubService
     */
    public CreateGithubService clientId(String clientId) {
        return put("clientId", clientId);
    }

    /**
     * GitHub App Client Secret
     *
     * @param clientSecret clientSecret
     * @return CreateGithubService
     */
    public CreateGithubService clientSecret(String clientSecret) {
        return put("clientSecret", clientSecret);
    }

    /**
     * Unique key of the GitHub instance setting
     *
     * @param key key
     * @return CreateGithubService
     */
    public CreateGithubService key(String key) {
        return put("key", key);
    }

    /**
     * GitHub App private key
     *
     * @param privateKey privateKey
     * @return CreateGithubService
     */
    public CreateGithubService privateKey(String privateKey) {
        return put("privateKey", privateKey);
    }

    /**
     * GitHub API URL
     *
     * @param url url
     * @return CreateGithubService
     */
    public CreateGithubService url(String url) {
        return put("url", url);
    }


}
