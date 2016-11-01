package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Sample page
 */
public class HomePage extends Page {

  public Header header = new Header();
  public String homePageUrl = "http://www.ebay.com/";


  public boolean isDisplayed() {
    return driver.getCurrentUrl().equalsIgnoreCase(homePageUrl);
  }


  public HomePage(WebDriver webDriver) throws MalformedURLException {
    super(webDriver);
  }
}
