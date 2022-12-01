package com.geewaza.sonarqube.webapi.model.almsettings;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 10:05
 **/
public class AlmSettings {

    private AlmSetting[] almSettings;

    public AlmSetting[] getAlmSettings() {
        return almSettings;
    }

    public void setAlmSettings(AlmSetting[] almSettings) {
        this.almSettings = almSettings;
    }
}
