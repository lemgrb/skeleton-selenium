package com.lemgrb.theinternet;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingPageTest extends TheInternetBaseTest {

    @Test
    public void testDynamicLoading() {
        HomePage homePage = new HomePage(driver);
        var dynamicLoadingPageExample1 = homePage.clickDynamicContent().clickExample1();
        dynamicLoadingPageExample1.clickStartButton();
        assertEquals(dynamicLoadingPageExample1.getLoadedText(), "Hello World!", "Loaded text is incorrect");
    }

}
