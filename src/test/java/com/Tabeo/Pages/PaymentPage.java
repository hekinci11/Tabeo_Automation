package com.Tabeo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends HomePage{


    @FindBy(xpath="//input[@id='cardNumber']")
    public WebElement CardNumber;

    @FindBy(xpath="//input[@id='cardExpiry']")
    public WebElement CardExpiry;

    @FindBy(xpath="//input[@id='cardCvc']")
    public WebElement CardCvc;

    @FindBy(xpath="//input[@id='billingName']")
    public WebElement BillingName;

    @FindBy(xpath="//div[@class='SubmitButton-IconContainer']")
    public WebElement SubmitButton;

    @FindBy(xpath="//select[@id='billingCountry']")
    public WebElement drpCountry;

    @FindBy(css=".text-4xl")
    public WebElement SuccessMessage;

    @FindBy(xpath="//button[@id='test-source-authorize-3ds']")
    public WebElement CompleteAuth;






}
