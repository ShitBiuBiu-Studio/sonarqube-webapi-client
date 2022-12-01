package com.geewaza.sonarqube.webapi.model.almintegrations;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 09:35
 **/
public class Repositories extends Paging {

    private Repository[] repositories;

    public Repository[] getRepositories() {
        return repositories;
    }

    public void setRepositories(Repository[] repositories) {
        this.repositories = repositories;
    }
}
