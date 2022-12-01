package com.geewaza.sonarqube.webapi.api.newcodeperiods;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import java.io.IOException;

/**
 * Updates the setting for the New Code Period on different levels:
 * Project key must be provided to update the value for a project
 * Both project and branch keys must be provided to update the value for a branch
 * Requires one of the following permissions:
 * 'Administer System' to change the global setting
 * 'Administer' rights on the specified project to change the project setting
 *
 * @author : wangheng
 * @date : 2022-11-02 09:40
 **/
public class SetNewCodePeriodService extends AbstractService<SetNewCodePeriodService, Boolean> {

    public SetNewCodePeriodService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"type"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/new_code_periods/set");
        return true;
    }

    /**
     * Branch key
     *
     * @param branch
     * @return
     */
    public SetNewCodePeriodService branch(String branch) {
        return put("branch", branch);
    }

    /**
     * Project key
     *
     * @param project
     * @return
     */
    public SetNewCodePeriodService project(String project) {
        return put("project", project);
    }

    /**
     * Type
     * New code periods of the following types are allowed:
     * SPECIFIC_ANALYSIS - can be set at branch level only
     * PREVIOUS_VERSION - can be set at any level (global, project, branch)
     * NUMBER_OF_DAYS - can be set at any level (global, project, branch)
     * REFERENCE_BRANCH - can only be set for projects and branches
     *
     * @param type
     * @return
     */
    public SetNewCodePeriodService type(String type) {
        return put("type", type);
    }

    /**
     * Value
     * For each type, a different value is expected:
     * the uuid of an analysis, when type is SPECIFIC_ANALYSIS
     * no value, when type is PREVIOUS_VERSION
     * a number, when type is NUMBER_OF_DAYS
     * a string, when type is REFERENCE_BRANCH
     *
     * @param value
     * @return
     */
    public SetNewCodePeriodService value(String value) {
        return put("value", value);
    }
}
