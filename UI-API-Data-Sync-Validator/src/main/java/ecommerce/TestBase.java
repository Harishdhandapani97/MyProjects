package com.harish.ecommercePriceStockSync.core;

/**
 * Base test class handling browser setup/teardown
 * <p>
 * Provides common WebDriver management functionality for all test classes
 * </p>
 */
public class TestBase {
    protected WebDriver driver;
    private static final Logger log = LogManager.getLogger(TestBase.class);

    /**
     * Initializes browser instance based on configuration
     * @implNote Uses browser type from config.properties
     */
    @BeforeClass
    public void setup() {
        String browser = ConfigManager.getBrowser().toLowerCase();
        
        try {
            switch(browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    log.info("Started Chrome browser");
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    log.info("Started Edge browser");
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }
            driver.manage().window().maximize();
            
        } catch (Exception e) {
            log.error("Browser initialization failed: {}", e.getMessage());
            throw new RuntimeException("Failed to initialize browser", e);
        }
    }

    /**
     * Cleans up browser resources after test execution
     */
    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.quit();
            driver = null;
            log.info("Browser closed successfully");
        }
    }
}