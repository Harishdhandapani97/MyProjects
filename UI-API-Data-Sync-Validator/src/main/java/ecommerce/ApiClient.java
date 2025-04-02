package com.harish.ecommercePriceStockSync.utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Handles API communications for product data
 */
public class ApiClient {
    private static final Logger log = LogManager.getLogger(ApiClient.class);
    
    public ApiClient() {
        // Initialize base API URL from configuration
        RestAssured.baseURI = ConfigManager.getApiBaseUrl();
        log.debug("Initialized API client with base URL: {}", ConfigManager.getApiBaseUrl());
    }

    /**
     * Fetches product data from API endpoint
     * @return API response containing product information
     * @throws RuntimeException if API communication fails
     */
    public Response getProductData() {
        try {
            log.info("Fetching product data from {}", RestAssured.baseURI + "/products");
            Response response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .get("/products");
            
            log.debug("API response status: {}", response.getStatusCode());
            return response;
            
        } catch (Exception e) {
            log.error("API request failed: {}", e.getMessage());
            throw new RuntimeException("Failed to retrieve product data", e);
        }
    }
}