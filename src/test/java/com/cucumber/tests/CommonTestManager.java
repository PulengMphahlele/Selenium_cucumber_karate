package com.cucumber.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
        features="src/test/resources/features",
        glue={"com.cucumber.stepdefs"},
        format={"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/re-run.txt"}
)
public class CommonTestManager
{
    public static WebDriver driver;
    private TestNGCucumberRunner testRunner;

    @BeforeClass
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        testRunner = new TestNGCucumberRunner(CommonTestManager.class);

    }


    @AfterTest
    public void closeBrowser() {

        driver.close();
    }

    @Test(description="login",dataProvider="features")
    public void login(CucumberFeatureWrapper cFeature)
    {
        testRunner.runCucumber(cFeature.getCucumberFeature());
    }
    @DataProvider(name="features")
    public Object[][] getFeatures()
    {
        return testRunner.provideFeatures();
    }
    @AfterClass
    public void tearDown()
    {
        testRunner.finish();
    }

}
