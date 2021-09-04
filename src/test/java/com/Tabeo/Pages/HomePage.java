package com.Tabeo.Pages;

import com.Tabeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  abstract class HomePage {
    public HomePage( ) {

        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css="#headlessui-tabs-tab-1")
    public WebElement CustomerReviewsButton;

    @FindBy(css="#headlessui-tabs-tab-2")
    public WebElement FAQButton;

    @FindBy(css="#headlessui-tabs-tab-3")
    public WebElement LicenseButton;

    @FindBy(xpath="//button[contains(text(),'/mo')]")
    public WebElement PayMoButton;

    @FindBy(xpath="//button[contains(text(),'Pay £220')]")
    public WebElement PayYearlyButton;

    @FindBy(xpath="//a[.='Read full license']")
    public WebElement ReadFullLicenseButton;






}
