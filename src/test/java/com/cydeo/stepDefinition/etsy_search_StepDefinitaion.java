package com.cydeo.stepDefinition;

import com.cydeo.pages.etsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class etsy_search_StepDefinitaion {

    etsySearchPage etsySearchPage = new etsySearchPage();

    @Given("User is on etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com ");
    }

    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Failed Title",expectedTitle,actualTitle);

    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

        etsySearchPage.searcBox.sendKeys("Wooden Spoon");
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchBoxBtn.click();

    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expextedTitle = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Wooden spoon title FAILED",actualTitle.contains(expextedTitle));

    }

}
