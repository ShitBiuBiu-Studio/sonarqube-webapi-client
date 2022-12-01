/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.issue;

/**
 * Auto-generated: 2022-05-03 19:33:29
 *
 * @author wangheng
 */
public class Rule {

    private String key;
    private String name;
    private String lang;
    private String status;
    private String langName;
    private String securityCategory;
    private String vulnerabilityProbability;

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getLangName() {
        return langName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public String getVulnerabilityProbability() {
        return vulnerabilityProbability;
    }

    public void setVulnerabilityProbability(String vulnerabilityProbability) {
        this.vulnerabilityProbability = vulnerabilityProbability;
    }
}