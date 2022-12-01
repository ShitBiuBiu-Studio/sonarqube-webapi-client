package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.almintegrations.ImportGitlabProjectsService;
import com.geewaza.sonarqube.webapi.api.almintegrations.ListAzureProjectsService;
import com.geewaza.sonarqube.webapi.api.almintegrations.ListBitbucketserverProjectsService;
import com.geewaza.sonarqube.webapi.api.almintegrations.SearchAzureReposService;
import com.geewaza.sonarqube.webapi.api.almintegrations.SearchBitbucketcloudReposService;
import com.geewaza.sonarqube.webapi.api.almintegrations.SearchBitbucketserverReposService;
import com.geewaza.sonarqube.webapi.api.almintegrations.SearchGitlabReposService;
import com.geewaza.sonarqube.webapi.api.almintegrations.SetPatService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 09:40
 **/
public class AlmIntegrationsClient extends AbstractSonarClient {

    public AlmIntegrationsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public ImportGitlabProjectsService importGitlabProjects() {
        return new ImportGitlabProjectsService(this.httpClient);

    }

    public ListAzureProjectsService listAzureProjects() {
        return new ListAzureProjectsService(this.httpClient);
    }

    public ListBitbucketserverProjectsService listBitbucketserverProjects() {
        return new ListBitbucketserverProjectsService(this.httpClient);
    }

    public SearchAzureReposService searchAzureRepos() {
        return new SearchAzureReposService(this.httpClient);
    }

    public SearchBitbucketcloudReposService searchBitbucketcloudRepos() {
        return new SearchBitbucketcloudReposService(this.httpClient);
    }

    public SearchBitbucketserverReposService searchBitbucketserverRepos() {
        return new SearchBitbucketserverReposService(this.httpClient);
    }

    public SearchGitlabReposService searchGitlabRepos() {
        return new SearchGitlabReposService(this.httpClient);
    }

    public SetPatService setPat() {
        return new SetPatService(this.httpClient);
    }

}
