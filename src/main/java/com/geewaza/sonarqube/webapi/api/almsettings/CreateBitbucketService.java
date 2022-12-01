package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Create Bitbucket ALM instance Setting.
 * Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class CreateBitbucketService extends
    AbstractService<CreateBitbucketService, Boolean> {

    public CreateBitbucketService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key", "personalAccessToken", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/create_bitbucket");
        return true;
    }

    /**
     * Unique key of the Bitbucket instance setting
     *
     * @param key key
     * @return CreateBitbucketService
     */
    public CreateBitbucketService key(String key) {
        return put("key", key);
    }

    /**
     * Bitbucket personal access token
     *
     * @param personalAccessToken personalAccessToken
     * @return CreateBitbucketService
     */
    public CreateBitbucketService personalAccessToken(String personalAccessToken) {
        return put("personalAccessToken", personalAccessToken);
    }

    /**
     * BitBucket server API URL
     *
     * @param url url
     * @return CreateBitbucketService
     */
    public CreateBitbucketService url(String url) {
        return put("url", url);
    }

}
