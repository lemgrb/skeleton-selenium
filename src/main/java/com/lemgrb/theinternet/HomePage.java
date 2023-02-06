package com.lemgrb.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPage clickDynamicContent() {
        String linkText = "Dynamic Loading";
        driver.findElement(By.linkText(linkText)).click();
        return new DynamicLoadingPage(this.driver);
    }
}
