package com.cucumber.stepdefs;

import com.cucumber.tests.CartRunner;
import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ShoppingCart {

    String prodName="";

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {

        delays(2);
        boolean result =  CartRunner.driver.findElement(By.xpath("//div[contains(text(),'Logged in as')]")).getText().contains("Logged in as");
        Assert.assertTrue(result);

    }

    @When("^I click home category button$")
    public void i_click_home_category_button() throws Throwable {

        delays(6);
        CartRunner.driver.findElement(By.xpath("//a[@href='/home/']//following::a[@href='/home/']")).click();

    }

    @When("^I click shop now$")
    public void i_click_shop_now() throws Throwable {

        CartRunner.driver.findElement(By.xpath("//img[@class='placement-image']//following::img[@class='placement-image']")).click();

    }

    @When("^I click first item$")
    public void i_click_first_item() throws Throwable {

        CartRunner.driver.findElement(By.xpath("//div[@class=\"catalog--product-image\"]//following::img")).click();

    }


    @When("^I click Add to cart$")
    public void i_click_Add_to_cart() throws Throwable {

        CartRunner.driver.findElement(By.xpath("//button[@data-selenium='addtocart-main']")).click();

        delays(6);

    }

    @When("^I remove an item$")
    public void i_remove_an_item() throws Throwable {

        delays(2);
        CartRunner.driver.findElement(By.xpath("//span[@class=\"icon ico-cart\"]")).click();

        delays(3);
        CartRunner.driver.findElement(By.xpath("//span[contains(text(),'Remove item')]")).click();

    }

    @Then("^item should be removed$")
    public void item_should_be_removed() throws Throwable {

        delays(2);
        String expectedError ="Your cart is empty! Please continue shopping.";

        String foundError = CartRunner.driver.findElement(By.xpath("//div[@class=\"shopping-cart-heading\"]//following::div")).getText();

        boolean results = (expectedError.equalsIgnoreCase(foundError));
        Assert.assertTrue(results);

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
