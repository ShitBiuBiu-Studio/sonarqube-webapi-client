package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.almsettings.Binding;
import com.geewaza.sonarqube.webapi.model.almsettings.Definitions;
import java.io.IOException;

/**
 * List ALM Settings, sorted by created date.
 * Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class ListDefinitionsService extends
    AbstractService<ListDefinitionsService, Definitions> {

    public ListDefinitionsService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Definitions doExecute() throws IOException {
        return doGet("api/alm_settings/list_definitions", Definitions.class);
    }
}
