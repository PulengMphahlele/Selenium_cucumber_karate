package com.cucumber.stepdefs;
import com.cucumber.tests.CommonTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage{

    @Given("^Open Application and Enter url$")
    public void open_Application_and_Enter_url() throws Throwable {
        CommonTestManager.driver.get("https://www.zando.co.za/customer/account/login/");

    }

    @When("^enter username$")
    public void enter_username() throws Throwable {

        CommonTestManager.driver.findElement(By.xpath("//input[@id='LoginForm_email']//following::input[@id='LoginForm_email']")).sendKeys("justicepuleng@gmail.com");
    }

    @When("^enter password$")
    public void enter_password() throws Throwable {

        CommonTestManager.driver.findElement(By.xpath("//input[@id='LoginForm_password']//following::input[@id='LoginForm_password']")).sendKeys("Z2nd0.c0.z2");

        delays(2);
        CommonTestManager.driver.findElement(By.xpath("//button[@id='login']//following::button[@id='login']")).click();
    }

    @Then("^verify Message$")
    public void verify_Msg() throws Throwable {
        boolean result =  CommonTestManager.driver.findElement(By.xpath("//div[contains(text(),'Logged in as')]")).getText().contains("Logged in as");
        Assert.assertTrue(result);
    }

    public void delays(int seconds) {

        int timeinMilliSeconds;
        try {
            timeinMilliSeconds = seconds * 1000;
            Thread.sleep(timeinMilliSeconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}