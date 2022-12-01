package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.almsettings.Binding;
import java.io.IOException;

/**
 * Get ALM binding of a given project.
 * Requires the 'Administer' permission on the project
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class GetBindingService extends
    AbstractService<GetBindingService, Binding> {

    public GetBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"project"};
    }

    @Override
    protected Binding doExecute() throws IOException {
        return doGet("api/alm_settings/get_binding", Binding.class);
    }

    /**
     * Project key
     *
     * @param project project
     * @return GetBindingService
     */
    public GetBindingService project(String project) {
        return put("project", project);
    }
}
