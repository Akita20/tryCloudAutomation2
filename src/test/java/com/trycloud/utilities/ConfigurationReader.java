package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();  //Create object of Properties class

 static {
     try {
         FileInputStream file = new FileInputStream("configuration.properties");  //Open the file using FileInputStream by passing the files path;
         properties.load(file); //load the file into "properties" object
         file.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);  //use "properties" object to read from ".properties" file
    }

}
