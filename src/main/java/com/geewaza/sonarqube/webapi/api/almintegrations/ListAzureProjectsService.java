package com.geewaza.sonarqube.webapi.api.almintegrations;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * List Azure projects
 * Requires the 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class ListAzureProjectsService extends
    AbstractService<ListAzureProjectsService, String> {

    public ListAzureProjectsService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_integrations/list_azure_projects");
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return ListAzureProjectsService
     */
    public ListAzureProjectsService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

}
