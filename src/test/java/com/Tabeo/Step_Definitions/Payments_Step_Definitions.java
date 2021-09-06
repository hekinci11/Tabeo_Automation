package com.Tabeo.Step_Definitions;


import com.Tabeo.Pages.PaymentPage;
import com.Tabeo.Utilities.BrowserUtils;
import com.Tabeo.Utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class Payments_Step_Definitions {

    @When("the user clicks on twenty pounds monthly button")
    public void the_user_clicks_on_twenty_pounds_monthly_button() {

        BrowserUtils.waitFor(2);
        new PaymentPage().PayMoButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user clicks on {int} pounds yearly button")
    public void the_user_clicks_on_pounds_yearly_button(Integer int1) {
        BrowserUtils.waitFor(2);
        new PaymentPage().PayYearlyButton.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user Enters the card number as {string}")
    public void the_user_Enters_the_card_number_as(String cardNumber) {

        BrowserUtils.waitForVisibility(new PaymentPage().CardNumber,15);

        new PaymentPage().CardNumber.sendKeys(cardNumber);

    }

    @When("the user Enters the card expiry date as {string}")
    public void the_user_Enters_the_card_expiry_date_as(String expiryDate) {

        new PaymentPage().CardExpiry.sendKeys(expiryDate);

    }

    @When("the user Enters the  card cvv number as {string}")
    public void the_user_Enters_the_card_cvv_number_as(String cvv) {

        new PaymentPage().CardCvc.sendKeys(cvv);
    }

    @When("the uer Enters the card holder name as {string}")
    public void the_uer_Enters_the_card_holder_name_as(String cardHolder) {

        new PaymentPage().BillingName.sendKeys(cardHolder);
    }

    @When("the user selects the country region as {string}")
    public void the_user_selects_the_country_region_as(String countryRegion) {

        BrowserUtils.waitFor(3);

        Select drpCountry = new Select(new PaymentPage().drpCountry);

        drpCountry.selectByVisibleText(countryRegion);

    }

    @When("the user clicks on submit button")
    public void the_user_clicks_on_submit_button() {

        new PaymentPage().SubmitButton.click();


    }


    @When("the user clicks on complete authentication button")
    public void the_user_clicks_on_complete_authentication_button() {
        BrowserUtils.waitFor(5);

        Driver.get().switchTo().frame(0);
        Driver.get().switchTo().frame(0);
        Driver.get().switchTo().frame(0);

        BrowserUtils.waitFor(5);


        new PaymentPage().CompleteAuth.click();
    }

    @Then("the user lands on success message page")
    public void the_user_lands_on_success_message_page() {


        BrowserUtils.waitForVisibility(new PaymentPage().SuccessMessage,15);


        assertEquals("Your purchase is ready to be downloaded.",new PaymentPage().SuccessMessage.getText());
    }

    @Then("the user lands on fail message page")
    public void the_user_lands_on_fail_message_page() {

        BrowserUtils.waitForVisibility(new PaymentPage().CardFailMessage,15);


        assertEquals("Your card has been declined.",new PaymentPage().CardFailMessage.getText());

    }



}
