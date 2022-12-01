package com.geewaza.sonarqube.webapi.api.almintegrations;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * List the Bitbucket Server projects Requires the 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SearchBitbucketcloudReposService extends
    AbstractService<SearchBitbucketcloudReposService, String> {

    public SearchBitbucketcloudReposService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_integrations/search_bitbucketcloud_repos");
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return SearchBitbucketcloudReposService
     */
    public SearchBitbucketcloudReposService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * 1-based page number
     *
     * @param p 1-based page number
     * @return SearchBitbucketcloudReposService
     */
    public SearchBitbucketcloudReposService p(String p) {
        return put("p", p);
    }

    /**
     * Page size. Must be greater than 0 and less or equal than 100
     *
     * @param ps ALM setting key
     * @return SearchBitbucketcloudReposService
     */
    public SearchBitbucketcloudReposService ps(String ps) {
        return put("ps", ps);
    }

    /**
     * Repository name filter
     *
     * @param repositoryName Repository name filter
     * @return SearchBitbucketcloudReposService
     */
    public SearchBitbucketcloudReposService repositoryName(String repositoryName) {
        return put("repositoryName", repositoryName);
    }

}
