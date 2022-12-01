package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Delete an ALM Settings. Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class DeleteService extends
    AbstractService<DeleteService, Boolean> {

    public DeleteService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_settings/delete");
        return true;
    }

    /**
     * ALM Setting key
     *
     * @param key key
     * @return DeleteService
     */
    public DeleteService key(String key) {
        return put("key", key);
    }
}
