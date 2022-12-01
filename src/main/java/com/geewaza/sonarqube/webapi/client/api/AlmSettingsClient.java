package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.almsettings.CountBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.CreateAzureService;
import com.geewaza.sonarqube.webapi.api.almsettings.CreateBitbucketService;
import com.geewaza.sonarqube.webapi.api.almsettings.CreateBitbucketcloudService;
import com.geewaza.sonarqube.webapi.api.almsettings.CreateGithubService;
import com.geewaza.sonarqube.webapi.api.almsettings.CreateGitlabService;
import com.geewaza.sonarqube.webapi.api.almsettings.DeleteBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.DeleteService;
import com.geewaza.sonarqube.webapi.api.almsettings.GetBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.ListAlmSettingsService;
import com.geewaza.sonarqube.webapi.api.almsettings.ListDefinitionsService;
import com.geewaza.sonarqube.webapi.api.almsettings.SetAzureBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.SetBitbucketBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.SetBitbucketcloudBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.SetGithubBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.SetGitlabBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.UpdateAzureService;
import com.geewaza.sonarqube.webapi.api.almsettings.UpdateBitbucketService;
import com.geewaza.sonarqube.webapi.api.almsettings.UpdateBitbucketcloudService;
import com.geewaza.sonarqube.webapi.api.almsettings.UpdateGithubService;
import com.geewaza.sonarqube.webapi.api.almsettings.UpdateGitlabService;
import com.geewaza.sonarqube.webapi.api.almsettings.ValidateBindingService;
import com.geewaza.sonarqube.webapi.api.almsettings.ValidateService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 10:36
 **/
public class AlmSettingsClient extends AbstractSonarClient {

    public AlmSettingsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public CountBindingService countBinding() {
        return new CountBindingService(this.httpClient);
    }

    public CreateAzureService createAzure() {
        return new CreateAzureService(this.httpClient);
    }

    public CreateBitbucketcloudService createBitbucketcloud() {
        return new CreateBitbucketcloudService(this.httpClient);
    }

    public CreateBitbucketService createBitbucket() {
        return new CreateBitbucketService(this.httpClient);
    }

    public CreateGithubService createGithub() {
        return new CreateGithubService(this.httpClient);
    }

    public CreateGitlabService createGitlab() {
        return new CreateGitlabService(this.httpClient);
    }

    public DeleteBindingService deleteBinding() {
        return new DeleteBindingService(this.httpClient);
    }

    public DeleteService delete() {
        return new DeleteService(this.httpClient);
    }

    public GetBindingService getBinding() {
        return new GetBindingService(this.httpClient);
    }

    public ListAlmSettingsService listAlmSettings() {
        return new ListAlmSettingsService(this.httpClient);
    }

    public ListDefinitionsService listDefinitions() {
        return new ListDefinitionsService(this.httpClient);
    }

    public SetAzureBindingService setAzureBinding() {
        return new SetAzureBindingService(this.httpClient);
    }

    public SetBitbucketBindingService setBitbucketBinding() {
        return new SetBitbucketBindingService(this.httpClient);
    }

    public SetBitbucketcloudBindingService setBitbucketcloudBinding() {
        return new SetBitbucketcloudBindingService(this.httpClient);
    }

    public SetGithubBindingService setGithubBinding() {
        return new SetGithubBindingService(this.httpClient);
    }

    public SetGitlabBindingService setGitlabBinding() {
        return new SetGitlabBindingService(this.httpClient);
    }

    public UpdateAzureService updateAzure() {
        return new UpdateAzureService(this.httpClient);
    }

    public UpdateBitbucketcloudService updateBitbucketcloud() {
        return new UpdateBitbucketcloudService(this.httpClient);
    }

    public UpdateBitbucketService updateBitbucket() {
        return new UpdateBitbucketService(this.httpClient);
    }

    public UpdateGithubService updateGithub() {
        return new UpdateGithubService(this.httpClient);
    }

    public UpdateGitlabService updateGitlab() {
        return new UpdateGitlabService(this.httpClient);
    }

    public ValidateBindingService validateBinding() {
        return new ValidateBindingService(this.httpClient);
    }

    public ValidateService validate() {
        return new ValidateService(this.httpClient);
    }

}
