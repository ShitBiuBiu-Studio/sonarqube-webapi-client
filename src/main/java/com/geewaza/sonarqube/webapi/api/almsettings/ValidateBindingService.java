package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Errors;
import java.io.IOException;

/**
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class ValidateBindingService extends
    AbstractService<ValidateBindingService, String> {

    public ValidateBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"project"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_settings/validate_binding");
    }

    /**
     * @param project project
     * @return ValidateService
     */
    public ValidateBindingService project(String project) {
        return put("project", project);
    }

}
