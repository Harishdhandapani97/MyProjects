package com.harish.ecommercePriceStockSync.tests;


import com.harish.ecommercePriceStockSync.config.ConfigManager;
import com.harish.ecommercePriceStockSync.pages.ProductPage;
import com.harish.ecommercePriceStockSync.utils.ApiClient;
import com.harish.ecommercePriceStockSync.core.TestBase;

/**
 * End-to-End test suite for price/inventory synchronization
 */
public class PriceInventoryTest extends TestBase {
    private static final Logger log = LogManager.getLogger(PriceInventoryTest.class);
    private final ApiClient apiClient = new ApiClient();
    private final ProductPage productPage = new ProductPage(driver);

    @Test
    public void verifyPriceAndStockSync() {
        try {
            // Get API data
            JsonPath apiResponse = apiClient.getProductData().jsonPath();
            String productId = apiResponse.getString("data.products[0].id");
            double apiPrice = apiResponse.getDouble("data.products[0].price");
            int apiStock = apiResponse.getInt("data.products[0].stock");

            // Get UI data
            driver.get(ConfigManager.getUiBaseUrl() + "/products/" + productId);
            double uiPrice = productPage.getProductPrice();
            int uiStock = productPage.getStockCount();

            // Assertions and logging
            Assert.assertEquals(uiPrice, apiPrice);
            Assert.assertEquals(uiStock, apiStock);
            log.info("Validation SUCCESS - Product: {}, Price: ${}, Stock: {}", 
                    productId, uiPrice, uiStock);

        } catch (Exception e) {
            log.error("Validation FAILED - {}", e.getMessage());
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
    }
}