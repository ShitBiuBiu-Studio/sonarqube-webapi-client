package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class RemoveProjectCreatorFromTemplateService extends AbstractService<RemoveProjectCreatorFromTemplateService, Boolean> {
    public RemoveProjectCreatorFromTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/remove_project_creator_from_template");
        return true;
    }
    public RemoveProjectCreatorFromTemplateService permission(String permission) {
        return put("permission", permission);
    }
    public RemoveProjectCreatorFromTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public RemoveProjectCreatorFromTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }
}
