package com.harish.ecommercePriceStockSync.config;

import java.io.InputStream;



import java.util.Properties;

/**
 * Manages configuration properties for the automation framework
 * <p>
 * Loads properties from config.properties file and provides access methods
 * </p>
 * 
 * @author Harish
 * @version 1.2
 */
public class ConfigManager {
    private static final Properties props = new Properties();

    static {
        loadProperties();
    }

    /**
     * Loads properties from config.properties file
     * @throws RuntimeException if properties file not found or loading fails
     */
    private static void loadProperties() {
        try (InputStream input = ConfigManager.class.getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new IllegalStateException("config.properties not found in classpath");
            }
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load configuration", e);
        }
    }

    // Property access methods
    
    public static String getApiBaseUrl() {
        return props.getProperty("api.base.url");
    }

    public static String getUiBaseUrl() {
        return props.getProperty("ui.base.url");
    }

    public static String getBrowser() {
        return props.getProperty("browser");
    }

    public static String getPriceSelector() {
        return props.getProperty("price.selector");
    }

    public static String getStockSelector() {
        return props.getProperty("stock.selector");
    }
}