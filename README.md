# sonarqube-webapi-client
 A Java client for interacting with the SonarQube server via Sonarqube web apis. \
 For SonarQube Version 7.9.5 . 
# User Guide

```java
public class SonarClientTest {

    private static final String SERVER_URL = "http://localhost:9000/";
    private static final String USER = "username";
    private static final String PASSWORD = "password";
    private static final String TOKEN = "accesstoken";

    @Test
    public void initSonarClientWithUserPassword() throws URISyntaxException, IOException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), USER, PASSWORD);
        Groups groups = client.getUserClient().getUserGroups(USER, null, null, null, null);
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

    @Test
    public void initSonarClientWithToken() throws URISyntaxException, IOException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TOKEN);
        Groups groups = client.getUserClient().getUserGroups(USER, null, null, null, null);
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

}
```

| API | code | test |
|:---|---|---|
|api/authentication|[ ]|[ ]|
|api/ce|[x]|[ ]|
|api/components|[x]|[ ]|
|api/duplications|[ ]|[ ]|
|api/favorites|[ ]|[ ]|
|api/issues|[ ]|[ ]|
|api/languages|[ ]|[ ]|
|api/measures|[x]|[ ]|
|api/metrics|[ ]|[ ]|
|api/notifications|[ ]|[ ]|
|api/permissions|[ ]|[ ]|
|api/plugins|[ ]|[ ]|
|api/project_analyses|[ ]|[ ]|
|api/project_badges|[ ]|[ ]|
|api/project_branches|[ ]|[ ]|
|api/project_links|[ ]|[ ]|
|api/project_pull_requests|[ ]|[ ]|
|api/project_tags|[ ]|[ ]|
|api/projects|[x]|[ ]|
|api/qualitygates|[ ]|[ ]|
|api/qualityprofiles|[ ]|[ ]|
|api/rules|[ ]|[ ]|
|api/server|[ ]|[ ]|
|api/settings|[ ]|[ ]|
|api/sources|[ ]|[ ]|
|api/system|[x]|[ ]|
|api/updatecenter|[ ]|[ ]|
|api/user_groups|[ ]|[ ]|
|api/user_tokens|[ ]|[ ]|
|api/users|[x]|[ ]|
|api/webhooks|[ ]|[ ]|
|api/webservices|[ ]|[ ]|