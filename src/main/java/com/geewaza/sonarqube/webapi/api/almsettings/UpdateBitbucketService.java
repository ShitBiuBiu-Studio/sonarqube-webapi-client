package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Update Bitbucket ALM instance Setting.
 * Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class UpdateBitbucketService extends
    AbstractService<UpdateBitbucketService, Boolean> {

    public UpdateBitbucketService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/update_bitbucket");
        return true;
    }

    /**
     * Unique key of the Bitbucket instance setting
     *
     * @param key key
     * @return UpdateBitbucketService
     */
    public UpdateBitbucketService key(String key) {
        return put("key", key);
    }

    /**
     * Optional new value for an unique key of the Bitbucket Devops instance setting
     *
     * @param newKey newKey
     * @return UpdateBitbucketService
     */
    public UpdateBitbucketService newKey(String newKey) {
        return put("newKey", newKey);
    }

    /**
     * Bitbucket Devops personal access token
     *
     * @param personalAccessToken personalAccessToken
     * @return UpdateBitbucketService
     */
    public UpdateBitbucketService personalAccessToken(String personalAccessToken) {
        return put("personalAccessToken", personalAccessToken);
    }

    /**
     * Bitbucket API URL
     *
     * @param url url
     * @return UpdateBitbucketService
     */
    public UpdateBitbucketService url(String url) {
        return put("url", url);
    }
}
