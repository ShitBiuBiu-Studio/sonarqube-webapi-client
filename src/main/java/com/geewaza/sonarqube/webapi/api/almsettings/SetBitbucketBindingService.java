package com.geewaza.sonarqube.webapi.api.almsettings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SetBitbucketBindingService extends
    AbstractService<SetBitbucketBindingService, String> {

    public SetBitbucketBindingService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting", "project", "repository", "slug"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/alm_settings/set_bitbucket_binding");
    }

    /**
     * @param almSetting almSetting
     * @return SetBitbucketBindingService
     */
    public SetBitbucketBindingService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * @param project project
     * @return SetBitbucketBindingService
     */
    public SetBitbucketBindingService project(String project) {
        return put("project", project);
    }

    /**
     * @param repository repository
     * @return SetBitbucketBindingService
     */
    public SetBitbucketBindingService repository(String repository) {
        return put("repository", repository);
    }

    /**
     * @param slug slug
     * @return SetBitbucketBindingService
     */
    public SetBitbucketBindingService slug(String slug) {
        return put("slug", slug);
    }
}
