package com.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pavellebed on 11/1/16.
 */
public class Header {

    @FindBy(xpath = "//header//td[@class='gh-td']")
    public WebElement ebayLogo;

}
