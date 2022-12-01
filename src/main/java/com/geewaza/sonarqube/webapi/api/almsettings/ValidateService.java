package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Errors;
import java.io.IOException;

/**
 * Validate an ALM Setting by checking connectivity and permissions Requires the 'Administer System'
 * permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class ValidateService extends
    AbstractService<ValidateService, Errors> {

    public ValidateService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key"};
    }

    @Override
    protected Errors doExecute() throws IOException {
        return doGet("api/alm_settings/validate", Errors.class);
    }

    /**
     * Unique key of the ALM settings
     *
     * @param key key
     * @return ValidateService
     */
    public ValidateService key(String key) {
        return put("key", key);
    }

}
