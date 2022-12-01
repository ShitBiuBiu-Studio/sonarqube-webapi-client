package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Update Bitbucket Cloud Setting. Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class UpdateBitbucketcloudService extends
    AbstractService<UpdateBitbucketcloudService, Boolean> {

    public UpdateBitbucketcloudService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"clientId", "key", "workspace"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/update_bitbucketcloud");
        return true;
    }

    /**
     * Bitbucket Cloud Client ID
     *
     * @param clientId clientId
     * @return UpdateBitbucketcloudService
     */
    public UpdateBitbucketcloudService clientId(String clientId) {
        return put("clientId", clientId);
    }

    /**
     * Optional new value for the Bitbucket Cloud client secret
     *
     * @param clientSecret clientSecret
     * @return UpdateBitbucketcloudService
     */
    public UpdateBitbucketcloudService clientSecret(String clientSecret) {
        return put("clientSecret", clientSecret);
    }

    /**
     * Unique key of the Bitbucket Cloud setting
     *
     * @param key key
     * @return UpdateBitbucketcloudService
     */
    public UpdateBitbucketcloudService key(String key) {
        return put("key", key);
    }

    /**
     * Optional new value for an unique key of the Bitbucket Cloud setting
     *
     * @param newKey newKey
     * @return UpdateBitbucketcloudService
     */
    public UpdateBitbucketcloudService newKey(String newKey) {
        return put("newKey", newKey);
    }

    /**
     * Bitbucket Cloud workspace ID
     *
     * @param workspace workspace
     * @return UpdateBitbucketcloudService
     */
    public UpdateBitbucketcloudService workspace(String workspace) {
        return put("workspace", workspace);
    }


}
