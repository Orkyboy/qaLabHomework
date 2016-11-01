package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pavellebed on 11/1/16.
 */
public class Header {

    @FindBy(xpath = "//header//h1[@id='gh-l-h1']")
    public WebElement ebayLogo;

}
