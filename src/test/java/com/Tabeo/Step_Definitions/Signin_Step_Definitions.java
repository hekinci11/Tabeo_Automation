package com.Tabeo.Step_Definitions;

import com.Tabeo.Pages.SigninPage;
import com.Tabeo.Utilities.BrowserUtils;
import com.Tabeo.Utilities.ConfigurationReader;
import com.Tabeo.Utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class Signin_Step_Definitions {


    @Given("the user signin with valid credentials")
    public void the_user_signin_with_valid_credentials() {

        new SigninPage().signin();

        BrowserUtils.waitFor(2);
    }

    @Given("the user is on the Sign in page")
    public void the_user_is_on_the_Sign_in_page() {

        Driver.get().get(ConfigurationReader.get("url"));


    }

    @When("the user clicks on Sign in button")
    public void the_user_clicks_on_Sign_in_button() {

        new SigninPage().SigninButton.click();

        Driver.get().findElement(By.xpath("//input[@id='email']")).sendKeys(ConfigurationReader.get("email"));
        BrowserUtils.waitFor(2);

    }

    @When("the user clicks on Sign in with Google button")
    public void the_user_clicks_on_Sign_in_with_Google_button() {
        BrowserUtils.waitForClickablility(new SigninPage().SigninWithGoogleButton,15);
        new SigninPage().SigninWithGoogleButton.click();


    }

    @When("the user enters the email")
    public void the_user_enters_the_email() {

       BrowserUtils.waitFor(2);

       BrowserUtils.waitForClickablility(new SigninPage().emailBox,15);

       new SigninPage().emailBox.sendKeys(ConfigurationReader.get("email"));



    }

    @When("the user clicks the next button")
    public void the_user_clicks_the_next_button() {

      BrowserUtils.waitForClickablility(new SigninPage().nextButton,15);

        new SigninPage().nextButton.click();

    }

    @When("the user enters the password")
    public void the_user_enters_the_password() {

        BrowserUtils.waitFor(2);

        BrowserUtils.waitForClickablility(new SigninPage().passwordBox,15);

        new SigninPage().passwordBox.sendKeys(ConfigurationReader.get("password"));


    }

    @Then("the user signs in")
    public void the_user_signs_in() {

        BrowserUtils.waitForVisibility(new SigninPage().signinCheck,15);


       assertEquals("Quality Assurance",new SigninPage().signinCheck.getText());

    }


}



