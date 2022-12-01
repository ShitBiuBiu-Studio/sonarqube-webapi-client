package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SetBitbucketcloudBindingService extends
    AbstractService<SetBitbucketcloudBindingService, String> {

    public SetBitbucketcloudBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting", "project", "repository"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_settings/set_bitbucketcloud_binding");
    }

    /**
     * @param almSetting almSetting
     * @return SetBitbucketcloudBindingService
     */
    public SetBitbucketcloudBindingService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * @param project project
     * @return SetBitbucketcloudBindingService
     */
    public SetBitbucketcloudBindingService project(String project) {
        return put("project", project);
    }

    /**
     * @param repository repository
     * @return SetBitbucketcloudBindingService
     */
    public SetBitbucketcloudBindingService repository(String repository) {
        return put("repository", repository);
    }
}
