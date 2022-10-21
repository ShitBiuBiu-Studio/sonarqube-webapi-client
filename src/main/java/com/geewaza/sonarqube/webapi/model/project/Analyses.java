package com.geewaza.sonarqube.webapi.model.project;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:22
 **/
public class Analyses extends Paging {
    private Analyse[] analyses;

    public Analyse[] getAnalyses() {
        return analyses;
    }

    public void setAnalyses(Analyse[] analyses) {
        this.analyses = analyses;
    }
}
