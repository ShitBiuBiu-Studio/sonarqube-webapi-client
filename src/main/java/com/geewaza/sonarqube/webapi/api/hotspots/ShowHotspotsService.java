package com.geewaza.sonarqube.webapi.api.hotspots;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.hotspots.Hotspot;
import java.io.IOException;

/**
 * Provides the details of a Security Hotspot.
 *
 * @author : wangheng
 * @date : 2022-11-03 09:13
 **/
public class ShowHotspotsService extends AbstractService<ShowHotspotsService, Hotspot> {

    public ShowHotspotsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"hotspot"};
    }

    @Override
    protected Hotspot doExecute() throws IOException {
        return doGet("api/hotspots/show", Hotspot.class);
    }

    /**
     * Provides the details of a Security Hotspot.
     *
     * @param hotspot hotspot
     * @return ShowHotspotsService
     */
    public ShowHotspotsService hotspot(String hotspot) {
        return put("hotspot", hotspot);
    }
}
