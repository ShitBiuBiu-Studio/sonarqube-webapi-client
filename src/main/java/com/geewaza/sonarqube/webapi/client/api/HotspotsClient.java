package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.hotspots.ShowHotspotsService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 11:07
 **/
public class HotspotsClient extends AbstractSonarClient {

    public HotspotsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public ShowHotspotsService showHotspots() {
        return new ShowHotspotsService(this.httpClient);
    }
}
