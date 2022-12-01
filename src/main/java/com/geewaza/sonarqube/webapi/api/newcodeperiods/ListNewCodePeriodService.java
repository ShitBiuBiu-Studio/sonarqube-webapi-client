package com.geewaza.sonarqube.webapi.api.newcodeperiods;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.language.Languages;
import com.geewaza.sonarqube.webapi.model.newcodeperiods.NewCodePeriods;
import java.io.IOException;

/**
 * List the New Code Periods for all branches in a project.
 * Requires the permission to browse the project
 *
 * @author : wangheng
 * @date : 2022-11-02 09:40
 **/
public class ListNewCodePeriodService extends AbstractService<ListNewCodePeriodService, NewCodePeriods> {

    public ListNewCodePeriodService(
        BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"project"};
    }

    @Override
    protected NewCodePeriods doExecute() throws IOException {
        return doGet("api/new_code_periods/list", NewCodePeriods.class);
    }

    /**
     * Project key
     *
     * @param project
     * @return
     */
    public ListNewCodePeriodService project(String project) {
        return put("project", project);
    }
}
