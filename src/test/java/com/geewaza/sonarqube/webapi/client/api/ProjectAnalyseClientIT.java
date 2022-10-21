package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarIT;
import com.geewaza.sonarqube.webapi.model.project.Analyses;
import com.geewaza.sonarqube.webapi.model.project.AnalysisEvents;
import com.geewaza.sonarqube.webapi.model.project.ProjectBranches;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-10-20 17:05
 **/
public class ProjectAnalyseClientIT extends SonarIT {


    @Test
    public void searchAnalysis_01() {
        String project = "welink";
        String branch = "develop-20221020103715-9ad5e5113cd1";
        Analyses result = client.getProjectAnalysesClient().searchAnalysis()
            .project(project)
            .branch(branch)
            .execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

}
