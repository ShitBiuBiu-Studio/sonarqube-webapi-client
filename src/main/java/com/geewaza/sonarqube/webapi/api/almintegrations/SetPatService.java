package com.geewaza.sonarqube.webapi.api.almintegrations;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Set a Personal Access Token for the given ALM setting
 * Only valid for Azure DevOps, Bitbucket Server, GitLab Alm and Bitbucket Cloud Setting
 * Requires the 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-11-16 19:59
 **/
public class SetPatService extends
    AbstractService<SetPatService, Boolean> {

    public SetPatService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"almSetting", "pat"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/alm_integrations/set_pat");
        return true;
    }

    /**
     * ALM setting key
     *
     * @param almSetting ALM setting key
     * @return SetPatService
     */
    public SetPatService almSetting(String almSetting) {
        return put("almSetting", almSetting);
    }

    /**
     * Personal Access Token
     *
     * @param pat Personal Access Token
     * @return SetPatService
     */
    public SetPatService pat(String pat) {
        return put("pat", pat);
    }

    /**
     * Username
     *
     * @param username Username
     * @return SetPatService
     */
    public SetPatService username(String username) {
        return put("username", username);
    }

}
