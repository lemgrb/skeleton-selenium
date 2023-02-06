package com.lemgrb.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By startButton = By.xpath(".//a[contains(text(),\"Example 1\")]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPageExample1 clickExample1() {
        driver.findElement(startButton).click();
        return new DynamicLoadingPageExample1(this.driver);
    }
}
