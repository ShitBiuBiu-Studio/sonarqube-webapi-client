package com.geewaza.sonarqube.webapi.api.almintegrations;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * List the Bitbucket Server projects
 * Requires the 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class ListBitbucketserverProjectsService extends
    AbstractService<ListBitbucketserverProjectsService, String> {

    public ListBitbucketserverProjectsService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_integrations/list_bitbucketserver_projects");
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return ListBitbucketserverProjectsService
     */
    public ListBitbucketserverProjectsService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

}
