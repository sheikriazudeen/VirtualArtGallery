package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
    // Static method to read connection properties from a property file
    public static String getPropertyString(String filename) {
        Properties properties = new Properties();
        String connectionString = "";
        try {
            // Load the property file
            properties.load(new FileInputStream(filename));
            // Construct the connection string
            connectionString = "jdbc:mysql://" + properties.getProperty("localhost") + ":" + properties.getProperty("3308")
                    + "/" + properties.getProperty("gall") + "?user=" + properties.getProperty("root") + "&password="
                    + properties.getProperty("Sivakumar1305") + "&useSSL=false";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connectionString;
    }
}
