package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.almsettings.Binding;
import java.io.IOException;

/**
 * List ALM setting available for a given project, sorted by ALM key
 * Requires the 'Administer project' permission if the 'project' parameter is provided, requires the 'Create Projects' permission otherwise.
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class ListAlmSettingsService extends
    AbstractService<ListAlmSettingsService, Binding> {

    public ListAlmSettingsService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Binding doExecute() throws IOException {
        return doGet("api/alm_settings/list", Binding.class);
    }

    /**
     * Project key
     *
     * @param project project
     * @return ListAlmSettingsService
     */
    public ListAlmSettingsService project(String project) {
        return put("project", project);
    }
}
