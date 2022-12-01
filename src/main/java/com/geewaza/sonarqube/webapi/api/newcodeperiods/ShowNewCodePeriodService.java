package com.geewaza.sonarqube.webapi.api.newcodeperiods;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.newcodeperiods.NewCodePeriod;
import java.io.IOException;

/**
 * Shows a setting for the New Code Period.
 * If the component requested doesn't exist or if no new code period is set for it, a value is inherited from the project or from the global setting.Requires one of the following permissions if a component is specified:
 * 'Administer' rights on the specified component
 * 'Execute analysis' rights on the specified component
 *
 * @author : wangheng
 * @date : 2022-11-02 09:40
 **/
public class ShowNewCodePeriodService extends AbstractService<ShowNewCodePeriodService, NewCodePeriod> {

    public ShowNewCodePeriodService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected NewCodePeriod doExecute() throws IOException {
        return doGet("api/new_code_periods/show", NewCodePeriod.class);
    }

    /**
     * Branch key
     *
     * @param branch
     * @return
     */
    public ShowNewCodePeriodService branch(String branch) {
        return put("branch", branch);
    }

    /**
     * Project key
     *
     * @param project
     * @return
     */
    public ShowNewCodePeriodService project(String project) {
        return put("project", project);
    }
}
