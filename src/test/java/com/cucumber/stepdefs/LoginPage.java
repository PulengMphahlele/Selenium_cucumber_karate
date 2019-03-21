package com.cucumber.stepdefs;
import com.cucumber.tests.CommonTestManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage
{
    @Given("^Open Application and Enter url$")
    public void open_Application_and_Enter_url() throws Throwable {
        CommonTestManager.driver.get("https://secure.takealot.com/account/login");

    }

    @When("^enter username$")
    public void enter_username() throws Throwable {
        CommonTestManager.driver.findElement(By.id("email")).sendKeys("justicepuleng@gmail.com");
    }

    @When("^enter password$")
    public void enter_password() throws Throwable {
        CommonTestManager.driver.findElement(By.id("password")).sendKeys("mph@hl3l3");

        CommonTestManager.driver.findElement(By.xpath("//button[@value=\"Login\"]")).click();
    }

    @Then("^verify Message$")
    public void verify_Msg() throws Throwable {
        boolean result =  CommonTestManager.driver.findElement(By.tagName("h4")).getText().contains("Logged");
        Assert.assertTrue(result);
    }
}