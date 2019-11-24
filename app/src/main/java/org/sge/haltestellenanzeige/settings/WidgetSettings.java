package org.sge.haltestellenanzeige.settings;

public class WidgetSettings {
    private static WidgetSettings settingsSingleton = null;

    public static WidgetSettings getInstance() {
        if (settingsSingleton == null) settingsSingleton = new WidgetSettings();
        return settingsSingleton;
    }
}
