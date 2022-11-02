package com.geewaza.sonarqube.webapi.api.newcodeperiods;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Unset the New Code Period setting for a branch, project or global.
 * Requires one of the following permissions:
 * 'Administer System' to change the global setting
 * 'Administer' rights for a specified component
 *
 * @author : wangheng
 * @date : 2022-11-02 09:40
 **/
public class UnsetNewCodePeriodService extends AbstractService<UnsetNewCodePeriodService, Boolean> {

    public UnsetNewCodePeriodService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/new_code_periods/unset");
        return true;
    }
    /**
     * Branch key
     *
     * @param branch
     * @return
     */
    public UnsetNewCodePeriodService branch(String branch) {
        return put("branch", branch);
    }

    /**
     * Project key
     *
     * @param project
     * @return
     */
    public UnsetNewCodePeriodService project(String project) {
        return put("project", project);
    }

}
