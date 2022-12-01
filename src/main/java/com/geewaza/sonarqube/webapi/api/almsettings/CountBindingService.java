package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.almsettings.CountBinding;
import java.io.IOException;

/**
 * Count number of project bound to an ALM setting. Requires the 'Administer System' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 20:03
 **/
public class CountBindingService extends AbstractService<CountBindingService, CountBinding> {

    public CountBindingService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting"};
    }

    @Override
    protected CountBinding doExecute() throws IOException {
        return doGet("api/alm_settings/count_binding", CountBinding.class);
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return CountBindingService
     */
    public CountBindingService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }
}
