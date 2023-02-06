package com.lemgrb.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TheInternetBaseTest {

    public WebDriver driver;
    public String rootUrl;

    @BeforeMethod(groups={"Regression"})
    @Parameters({"rootUrl","browser"})
    public void openBrowserAndHomepage(@Optional("https://the-internet.herokuapp.com/") String rootUrl, @Optional("Chrome") String browser) {
        rootUrl = rootUrl;
        switch (browser) {
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Chrome":
            default:
                driver = new ChromeDriver();
        }
        driver.get(rootUrl);
    }

    @AfterMethod(groups={"Regression"})
    public void closeBrowserAndQuitDriver() {
        driver.quit();
    }
}
