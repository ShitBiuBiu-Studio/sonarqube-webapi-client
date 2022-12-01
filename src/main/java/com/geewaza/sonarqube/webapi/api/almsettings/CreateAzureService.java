package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Create Azure ALM instance Setting. Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class CreateAzureService extends
    AbstractService<CreateAzureService, Boolean> {

    public CreateAzureService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key", "personalAccessToken", "url"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/create_azure");
        return true;
    }

    /**
     * Unique key of the Azure Devops instance setting
     *
     * @param key key
     * @return CreateAzureService
     */
    public CreateAzureService key(String key) {
        return put("key", key);
    }

    /**
     * Azure Devops personal access token
     *
     * @param personalAccessToken personalAccessToken
     * @return CreateAzureService
     */
    public CreateAzureService personalAccessToken(String personalAccessToken) {
        return put("personalAccessToken", personalAccessToken);
    }

    /**
     * Azure API URL
     *
     * @param url url
     * @return CreateAzureService
     */
    public CreateAzureService url(String url) {
        return put("url", url);
    }

}
