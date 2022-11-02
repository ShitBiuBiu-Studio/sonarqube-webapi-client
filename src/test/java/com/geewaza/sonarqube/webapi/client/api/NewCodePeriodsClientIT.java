package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarIT;
import com.geewaza.sonarqube.webapi.model.newcodeperiods.NewCodePeriod;
import com.geewaza.sonarqube.webapi.model.newcodeperiods.NewCodePeriods;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-11-02 15:40
 **/
public class NewCodePeriodsClientIT extends SonarIT {

    @Test
    public void listNewCodePeriod_test01() {
        String projectKey = "welink";
        NewCodePeriods newCodePeriods = client.getNewCodePeriodsClient()
            .listNewCodePeriod()
            .project(projectKey)
            .execute();
        System.out.println(JSONObject.toJSONString(newCodePeriods));
        Assert.assertNotNull(newCodePeriods);
    }


    @Test
    public void searchIssuesService_test01() {
        String projectKey = "welink";
        String branchKey = "develop-20221102091139-55863036ecd7";
        NewCodePeriod newCodePeriod = client.getNewCodePeriodsClient()
            .showNewCodePeriod()
            .project(projectKey)
            .branch(branchKey)
            .execute();
        System.out.println(JSONObject.toJSONString(newCodePeriod));
        Assert.assertNotNull(newCodePeriod);
    }

}
