package com.geewaza.sonarqube.webapi.api.plugins;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Uninstalls the plugin specified by its key.
 * Requires user to be authenticated with Administer System permissions.
 *
 * @author : wangheng
 * @date : 2022-05-05 10:55
 **/
public class UninstallPluginService extends AbstractService<UninstallPluginService, Boolean> {
    public UninstallPluginService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/plugins/uninstall");
        return true;
    }
    public UninstallPluginService key(String key) {
        return put("key", key);
    }
}
