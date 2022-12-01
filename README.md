# sonarqube-webapi-client
 A Java client for interacting with the SonarQube server via Sonarqube web apis. \
 For SonarQube Version 8.7 . 
# User Guide

```java
public class SonarClientTest {

    private static final String SERVER_URL = "http://sonarhost:9000/";
    private static final String USER = "username";
    private static final String PASSWORD = "password";
    private static final String TOKEN = "access_token";

    @Test
    public void createProject_01() throws URISyntaxException {
        String project = "test-002";
        System.out.println("project=" + project);
        SonarClient client = new SonarClient(new URI(SERVER_URL), USER, PASSWORD);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void createProject_02() throws URISyntaxException {
        String project = "test-003";
        System.out.println("project=" + project);
        SonarClient client = new SonarClient(new URI(SERVER_URL), TOKEN);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }
}
```
# TODO List  UPDATE TO v8.7
| API | Coding | Testing |
|:---|---|---|
|api/alm_integrations|[x]|[ ]|
|api/alm_settings|[x]|[ ]|
|api/authentication|[x]|[ ]|
|api/ce|[x]|[ ]|
|api/components|[x]|[-]|
|api/duplications|[x]|[ ]|
|api/favorites|[x]|[ ]|
|api/hotspots|[x]|[ ]|
|api/issues|[x]|[-]|
|api/languages|[x]|[ ]|
|api/measures|[x]|[-]|
|api/metrics|[x]|[ ]|
|api/new_code_periods|[x]|[-]|
|api/notifications|[x]|[ ]|
|api/permissions|[x]|[ ]|
|api/plugins|[x]|[ ]|
|api/project_analyses|[x]|[ ]|
|api/project_badges|[x]|[ ]|
|api/project_branches|[x]|[-]|
|api/project_links|[x]|[ ]|
|api/project_pull_requests|[x]|[ ]|
|api/project_tags|[x]|[ ]|
|api/projects|[x]|[-]|
|api/qualitygates|[x]|[ ]|
|api/qualityprofiles|[x]|[ ]|
|api/rules|[x]|[ ]|
|api/server|[x]|[ ]|
|api/settings|[x]|[-]|
|api/sources|[x]|[ ]|
|api/system|[x]|[ ]|
|api/updatecenter|[x]|[ ]|
|api/user_groups|[x]|[ ]|
|api/user_tokens|[x]|[ ]|
|api/users|[x]|[ ]|
|api/webhooks|[x]|[ ]|
|api/webservices|[x]|[ ]|

# Contribution
### Library
Contributing to standard library follows standard workflow. Create feature/bugfix branch, implement, create pull request with me as a reviewer and merge after approval :-)

### Testing
The library is tested manually at this point. If you are interested in implementing any kind of testing, unit testing, integration testing, end-to-end testing, potentially including some virtualization you are welcome to do so. Please follow the same workflow as for any work on library itself.
