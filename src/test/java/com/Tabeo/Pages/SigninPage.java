package com.Tabeo.Pages;

import com.Tabeo.Utilities.BrowserUtils;
import com.Tabeo.Utilities.ConfigurationReader;
import com.Tabeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SigninPage extends HomePage {


    @FindBy(xpath="//button[text()='Sign in']")
    public WebElement SigninButton;


    @FindBy(xpath="//button[.='Sign in with Google']")
    public WebElement SigninWithGoogleButton;


    @FindBy(xpath = "//*[@id='identifierId']")
    public WebElement emailBox;

    @FindBy(css = ".VfPpkd-LgbsSe-OWXEXe-k8QpJ > .VfPpkd-vQzf8d")
    public WebElement nextButton;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[@class='text-gray-600 text-sm mr-2']")
    public WebElement signinCheck;

    public void signin(){

        Driver.get().get(ConfigurationReader.get("url"));

        SigninButton.click();

        Driver.get().findElement(By.xpath("//input[@id='email']")).sendKeys(ConfigurationReader.get("email"));
        BrowserUtils.waitFor(2);

        BrowserUtils.waitForClickablility( SigninWithGoogleButton,15);
        SigninWithGoogleButton.click();


        BrowserUtils.waitFor(2);

        BrowserUtils.waitForClickablility( emailBox,15);

        emailBox.sendKeys(ConfigurationReader.get("email"));


        BrowserUtils.waitForClickablility( nextButton,15);

        nextButton.click();

        BrowserUtils.waitFor(2);

        BrowserUtils.waitForClickablility( passwordBox,15);

       passwordBox.sendKeys(ConfigurationReader.get("password"));
       nextButton.click();
    }


}

