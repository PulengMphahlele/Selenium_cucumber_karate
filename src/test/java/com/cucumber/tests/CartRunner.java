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
        features="src/test/resources/features/cart.feature",
        glue={"com.cucumber.stepdefs"},
        format={"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/re-run.txt"}
)
public class CartRunner
{
    public static WebDriver driver;
    private TestNGCucumberRunner testRunner;

    @BeforeClass
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        testRunner = new TestNGCucumberRunner(CartRunner.class);

        driver.get("https://www.zando.co.za/customer/account/login/");

        driver.findElement(By.xpath("//input[@id='LoginForm_email']//following::input[@id='LoginForm_email']")).sendKeys("justicepuleng@gmail.com");


        driver.findElement(By.xpath("//input[@id='LoginForm_password']//following::input[@id='LoginForm_password']")).sendKeys("Z2nd0.c0.z2");

        driver.findElement(By.xpath("//button[@id='login']//following::button[@id='login']")).click();

    }


    @AfterTest
    public void closeBrowser() {

        driver.close();
    }

    @Test(description="cart",dataProvider="features")
    public void cart(CucumberFeatureWrapper cFeature)
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
