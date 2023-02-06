package com.lemgrb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class DuckDuckGoSearchTest extends BaseTest {
    @Test(groups={"Regression"})
    public void canSearchForATerm() {
        String searchKey = "Sample";
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys(searchKey);
        searchInput.sendKeys(Keys.ENTER);
        WebElement resultDiv = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("links")));
        List<WebElement> resultsWebElements = driver.findElements(By.className("nrn-react-div"));
        // All text results should contain searchKey
        List<String> resultsString = resultsWebElements.stream().map(e -> e.getText()).collect(Collectors.toList());
        Assert.assertTrue(resultsString.size()>0, "Results is 0");

        SoftAssert softAssert = new SoftAssert();
        for(String result: resultsString) {
            softAssert.assertTrue(result.toLowerCase().contains(searchKey.toLowerCase()),result + " <-- Result does not contain search key=" +searchKey);
        }
        softAssert.assertAll();
    }

    @Test
    public void loremIpsum() {

    }
}
