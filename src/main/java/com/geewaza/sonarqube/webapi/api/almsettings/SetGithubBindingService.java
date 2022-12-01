package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SetGithubBindingService extends
    AbstractService<SetGithubBindingService, String> {

    public SetGithubBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting", "project", "repository"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_settings/set_github_binding");
    }

    /**
     * @param almSetting almSetting
     * @return SetGithubBindingService
     */
    public SetGithubBindingService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * @param project project
     * @return SetGithubBindingService
     */
    public SetGithubBindingService project(String project) {
        return put("project", project);
    }

    /**
     * @param repository repository
     * @return SetGithubBindingService
     */
    public SetGithubBindingService repository(String repository) {
        return put("repository", repository);
    }

    /**
     * @param summaryCommentEnabled summaryCommentEnabled
     * @return SetGithubBindingService
     */
    public SetGithubBindingService summaryCommentEnabled(String summaryCommentEnabled) {
        return put("summaryCommentEnabled", summaryCommentEnabled);
    }
}
