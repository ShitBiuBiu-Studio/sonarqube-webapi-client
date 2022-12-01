package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SetAzureBindingService extends
    AbstractService<SetAzureBindingService, String> {

    public SetAzureBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting", "project", "projectName", "repositoryName"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_settings/set_azure_binding");
    }

    /**
     * @param almSetting almSetting
     * @return SetAzureBindingService
     */
    public SetAzureBindingService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * @param project project
     * @return SetAzureBindingService
     */
    public SetAzureBindingService project(String project) {
        return put("project", project);
    }

    /**
     * @param projectName projectName
     * @return SetAzureBindingService
     */
    public SetAzureBindingService projectName(String projectName) {
        return put("projectName", projectName);
    }

    /**
     * @param repositoryName repositoryName
     * @return SetAzureBindingService
     */
    public SetAzureBindingService repositoryName(String repositoryName) {
        return put("repositoryName", repositoryName);
    }
}
