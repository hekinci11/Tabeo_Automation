package com.Tabeo.Step_Definitions;

import com.Tabeo.Pages.HomePage;
import com.Tabeo.Utilities.BrowserUtils;
import com.Tabeo.Utilities.ConfigurationReader;
import com.Tabeo.Utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class HomePage_Step_Definitions extends HomePage{


    @Given("the user is on the Home Page")
    public void the_user_is_on_the_Home_Page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user clicks the Reviews Button")
    public void the_user_clicks_the_Reviews_Button() {

        CustomerReviewsButton.click();

    }

    @Then("the user should be able to see Customer Reviews")
    public void the_user_should_be_able_to_see_Customer_Reviews() {

        assertEquals("This icon pack is just what I need for my latest project. There's an icon for just about anything I could ever need. Love the playful look!",review1.getText());

    }

    @When("the user clicks the FAQ Button")
    public void the_user_clicks_the_FAQ_Button() {

        FAQButton.click();
    }

    @Then("the user should be able to see FAQ")
    public void the_user_should_be_able_to_see_FAQ() {
        assertEquals("What format are these icons?",FAQ1.getText());
    }


    @When("the user clicks the License Button")
    public void the_user_clicks_the_License_Button() {

        LicenseButton.click();
    }

    @Then("the user should be able to see  License")
    public void the_user_should_be_able_to_see_License() {

        assertEquals("Overview",License.getText());

    }

    @When("the user clicks Pay Button")
    public void the_user_clicks_Pay_Button() {
        PayMoButton.click();

    }

    @Then("the user should not be able to pay without sign in")
    public void the_user_should_not_be_able_to_pay_without_sign_in() {

        BrowserUtils.waitForVisibility(SigninText,15);

        assertEquals("Sign in to your account",SigninText.getText());
    }

    @When("the user clicks {string}")
    public void the_user_clicks(String ButtonType) {


        if (ButtonType.equals("InstagramButton")){
            InstagramButton.click();}
        else if(ButtonType.equals("TwitterButton")){
            TwitterButton.click();
        }else {
            FacebookButton.click();
              }
    }

    @Then("the user should be able to share by using {string}")
    public void the_user_should_be_able_to_share_by_using(String ButtonType) {


        if (ButtonType.equals("InstagramButton")){

        Assert.assertTrue( Driver.get().getCurrentUrl().contains("instagram.com"));
        }
        else if(ButtonType.equals("TwitterButton")){
            Assert.assertTrue( Driver.get().getCurrentUrl().contains("twitter.com"));
        }else {
            Assert.assertTrue( Driver.get().getCurrentUrl().contains("facebook.com"));
        }


    }






}
