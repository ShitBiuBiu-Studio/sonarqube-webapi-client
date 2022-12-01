package com.geewaza.sonarqube.webapi.api.almintegrations;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.almintegrations.Repositories;
import java.io.IOException;

/**
 * Search the GitLab projects.
 * Requires the 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SearchGitlabReposService extends
    AbstractService<SearchGitlabReposService, Repositories> {

    public SearchGitlabReposService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting"};
    }

    @Override
    protected Repositories doExecute() throws IOException {
        return doGet("api/alm_integrations/search_gitlab_repos", Repositories.class);
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return SearchGitlabReposService
     */
    public SearchGitlabReposService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * Project name filter
     *
     * @param projectName Project name filter
     * @return SearchGitlabReposService
     */
    public SearchGitlabReposService projectName(String projectName) {
        return put("projectName", projectName);
    }

    /**
     * Repository name filter
     *
     * @param repositoryName Repository name filter
     * @return SearchGitlabReposService
     */
    public SearchGitlabReposService repositoryName(String repositoryName) {
        return put("repositoryName", repositoryName);
    }
}
