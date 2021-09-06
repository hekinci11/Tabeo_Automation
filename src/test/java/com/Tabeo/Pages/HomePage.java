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

    @FindBy(xpath="//p[contains(.,\"This icon pack is just what I need for my latest project. There's an icon for ju\")]")
    public WebElement review1;

    @FindBy(xpath="//dt[.='What format are these icons?']")
    public WebElement FAQ1;

    @FindBy(xpath="//h4[.='Overview']")
    public WebElement License;

    @FindBy(css=".text-xl")
    public WebElement SigninText;

    @FindBy(css="[viewBox='0 0 24 24']")
    public WebElement InstagramButton;

    @FindBy(xpath="(//li)[6]/a")
    public WebElement TwitterButton;

    @FindBy(css=".space-x-6 > li:nth-of-type(1) .w-5")
    public WebElement FacebookButton;











}
