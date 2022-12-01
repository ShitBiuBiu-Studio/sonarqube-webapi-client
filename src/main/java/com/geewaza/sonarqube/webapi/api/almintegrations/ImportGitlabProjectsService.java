package com.geewaza.sonarqube.webapi.api.almintegrations;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Import a GitLab project to SonarQube, creating a new project and configuring MR decoration
 * Requires the 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class ImportGitlabProjectsService extends
    AbstractService<ImportGitlabProjectsService, Boolean> {

    public ImportGitlabProjectsService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting", "gitlabProjectId"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_integrations/import_gitlab_project");
        return true;
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return ImportGitlabProjectService
     */
    public ImportGitlabProjectsService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * GitLab project ID
     *
     * @param gitlabProjectId GitLab project ID
     * @return ImportGitlabProjectService
     */
    public ImportGitlabProjectsService gitlabProjectId(String gitlabProjectId) {
        return put("gitlabProjectId", gitlabProjectId);
    }

}
