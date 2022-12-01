package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class DeleteBindingService extends
    AbstractService<DeleteBindingService, Boolean> {

    public DeleteBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"project"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/delete_binding");
        return true;
    }

    /**
     *
     * @param project project
     * @return DeleteBindingService
     */
    public DeleteBindingService project(String project) {
        return put("project", project);
    }
}
