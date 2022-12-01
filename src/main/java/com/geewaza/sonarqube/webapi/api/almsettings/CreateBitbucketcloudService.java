package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Configure a new instance of Bitbucket Cloud. Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class CreateBitbucketcloudService extends
    AbstractService<CreateBitbucketcloudService, Boolean> {

    public CreateBitbucketcloudService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"clientId", "clientSecret", "key", "workspace"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/create_bitbucketcloud");
        return true;
    }

    /**
     * Bitbucket Cloud Client ID
     *
     * @param clientId clientId
     * @return CreateBitbucketcloudService
     */
    public CreateBitbucketcloudService clientId(String clientId) {
        return put("clientId", clientId);
    }

    /**
     * Bitbucket Cloud Client Secret
     *
     * @param clientSecret clientSecret
     * @return CreateBitbucketcloudService
     */
    public CreateBitbucketcloudService clientSecret(String clientSecret) {
        return put("clientSecret", clientSecret);
    }

    /**
     * Unique key of the Bitbucket Cloud setting
     *
     * @param key key
     * @return CreateBitbucketcloudService
     */
    public CreateBitbucketcloudService key(String key) {
        return put("key", key);
    }

    /**
     * Bitbucket Cloud workspace ID
     *
     * @param workspace workspace
     * @return CreateBitbucketcloudService
     */
    public CreateBitbucketcloudService workspace(String workspace) {
        return put("workspace", workspace);
    }

}
