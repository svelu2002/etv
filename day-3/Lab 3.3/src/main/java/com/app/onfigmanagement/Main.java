package com.app.onfigmanagement;

import com.app.onfigmanagement.configuration.ConfigurationManager;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Path currentDirectory = Paths.get("").toAbsolutePath();
        System.out.println("Current Directory: " + currentDirectory);
        String subdirectoryName1 = "day-3\\Lab 3.3";
        Path subdirectoryPath1 = currentDirectory.resolve(subdirectoryName1);
        System.out.println("Subdirectory Path 1: " + subdirectoryPath1);
        Path configFilePath = Paths.get("C:\\Users\\Administrator\\Desktop\\Labs\\day-3\\Lab 3.3\\config.properties");
        ConfigurationManager configManager = new ConfigurationManager(configFilePath);

        try {
            // TODO: Test reading the configuration
            String currentConfig = configManager.readConfiguration();
            System.out.println("Current Configuration:\n" + currentConfig);

            // TODO: Test updating the configuration
            String updatedConfig = currentConfig + "\nnew_property=value";
            configManager.updateConfiguration(updatedConfig);
            System.out.println("Configuration Updated.");

            // TODO: Test generating a sample configuration with embedded logic
            String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";

            String sampleConfig = configManager.generateSampleConfiguration(jdbcUrl);
            System.out.println("Sample Configuration:\n" + sampleConfig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
