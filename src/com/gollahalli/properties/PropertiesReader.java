package com.gollahalli.properties;

import java.io.*;
import java.util.Properties;

/**
 * Created by akshayrajgollahalli on 2/10/15.
 */
public class PropertiesReader {
    public String[] reader(){
        String[] result = new String[4];
        Properties properties = new Properties();
        InputStream is;

        try {
            File file = new File("GUpdater.properties");
            is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            is = null;
        }

        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        result[0] = properties.getProperty("Name");
        result[1] = properties.getProperty("CurrentVersion");
        result[2] = properties.getProperty("NewVersion");
        result[3] = properties.getProperty("Summary");

        return result;
    }
}
