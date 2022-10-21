/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.measure;

import com.geewaza.sonarqube.webapi.model.component.Component;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class ComponentMeasures {

    private Component component;
    private Metric[] metrics;
    private Period period;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Metric[] getMetrics() {
        return metrics;
    }

    public void setMetrics(Metric[] metrics) {
        this.metrics = metrics;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}