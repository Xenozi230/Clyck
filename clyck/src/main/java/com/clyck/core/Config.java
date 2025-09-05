package com.clyck.core;

import java.io.*;
import java.util.Properties;

public class Config {

    private Properties props;
    private final String configFile = "config.properties";

    public Config() {
        props = new Properties();
        load();
    }

    public void load() {
        try (InputStream input = new FileInputStream(configFile)) {
            props.load(input);
        }catch (IOException e) {
            System.out.println("Config file not found, default values used");
            props.setProperty("interval", "200");
        }
    }

    public void save() {
        try (OutputStream output = new FileOutputStream(configFile)) {
            props.store(output, "Clyck Config");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public int getInterval() {
        return Integer.parseInt(props.getProperty("interval","200"));
    }

    public void setInterval(int interval) {
        props.setProperty("interval", String.valueOf(interval));
    }
}
