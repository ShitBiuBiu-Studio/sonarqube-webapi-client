package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SetGitlabBindingService extends
    AbstractService<SetGitlabBindingService, String> {

    public SetGitlabBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting", "project"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_settings/set_gitlab_binding");
    }

    /**
     * @param almSetting almSetting
     * @return SetGitlabBindingService
     */
    public SetGitlabBindingService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * @param project project
     * @return SetGitlabBindingService
     */
    public SetGitlabBindingService project(String project) {
        return put("project", project);
    }

    /**
     * @param repository repository
     * @return SetGitlabBindingService
     */
    public SetGitlabBindingService repository(String repository) {
        return put("repository", repository);
    }
}
