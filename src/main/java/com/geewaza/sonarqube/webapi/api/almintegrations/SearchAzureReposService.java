package com.geewaza.sonarqube.webapi.api.almintegrations;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Search the Azure repositories
 * Requires the 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SearchAzureReposService extends
    AbstractService<SearchAzureReposService, String> {

    public SearchAzureReposService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_integrations/search_azure_repos");
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return SearchAzureReposService
     */
    public SearchAzureReposService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * Project name filter
     *
     * @param projectName ALM setting key
     * @return SearchAzureReposService
     */
    public SearchAzureReposService projectName(String projectName) {
        return put("projectName", projectName);
    }

    /**
     * Search query filter
     *
     * @param searchQuery ALM setting key
     * @return SearchAzureReposService
     */
    public SearchAzureReposService searchQuery(String searchQuery) {
        return put("searchQuery", searchQuery);
    }

}
