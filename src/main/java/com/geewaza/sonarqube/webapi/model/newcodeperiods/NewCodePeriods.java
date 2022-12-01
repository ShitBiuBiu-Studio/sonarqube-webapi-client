package com.geewaza.sonarqube.webapi.model.newcodeperiods;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-11-02 15:07
 **/
public class NewCodePeriods {

    private NewCodePeriod[] newCodePeriods;

    public NewCodePeriod[] getNewCodePeriods() {
        return newCodePeriods;
    }

    public void setNewCodePeriods(
        NewCodePeriod[] newCodePeriods) {
        this.newCodePeriods = newCodePeriods;
    }
}
