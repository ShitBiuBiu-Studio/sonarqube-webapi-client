package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.newcodeperiods.ListNewCodePeriodService;
import com.geewaza.sonarqube.webapi.api.newcodeperiods.SetNewCodePeriodService;
import com.geewaza.sonarqube.webapi.api.newcodeperiods.ShowNewCodePeriodService;
import com.geewaza.sonarqube.webapi.api.newcodeperiods.UnsetNewCodePeriodService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-11-02 15:25
 **/
public class NewCodePeriodsClient extends AbstractSonarClient {

    public NewCodePeriodsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public ListNewCodePeriodService listNewCodePeriod() {
        return new ListNewCodePeriodService(this.httpClient);
    }

    public SetNewCodePeriodService setNewCodePeriod() {
        return new SetNewCodePeriodService(this.httpClient);
    }

    public ShowNewCodePeriodService showNewCodePeriod() {
        return new ShowNewCodePeriodService(this.httpClient);
    }

    public UnsetNewCodePeriodService unsetNewCodePeriod() {
        return new UnsetNewCodePeriodService(this.httpClient);
    }
}
