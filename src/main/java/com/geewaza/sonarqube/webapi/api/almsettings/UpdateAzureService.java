package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Update Azure ALM instance Setting.
 * Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class UpdateAzureService extends
    AbstractService<UpdateAzureService, Boolean> {

    public UpdateAzureService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/update_azure");
        return true;
    }

    /**
     * Unique key of the Azure instance setting
     *
     * @param key key
     * @return UpdateAzureService
     */
    public UpdateAzureService key(String key) {
        return put("key", key);
    }

    /**
     * Optional new value for an unique key of the Azure Devops instance setting
     *
     * @param newKey newKey
     * @return UpdateAzureService
     */
    public UpdateAzureService newKey(String newKey) {
        return put("newKey", newKey);
    }

    /**
     * Azure Devops personal access token
     *
     * @param personalAccessToken personalAccessToken
     * @return UpdateAzureService
     */
    public UpdateAzureService personalAccessToken(String personalAccessToken) {
        return put("personalAccessToken", personalAccessToken);
    }

    /**
     * Azure API URL
     *
     * @param url url
     * @return UpdateAzureService
     */
    public UpdateAzureService url(String url) {
        return put("url", url);
    }
}
