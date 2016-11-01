package com.example;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ru.stqa.selenium.factory.WebDriverPool;

import com.example.util.PropertyLoader;

/**
 * Base class for TestNG-based test classes
 */
public class TestNgTestBase {

  protected WebDriver driver;

  @BeforeSuite
  public void initWebDriver() {
    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
    driver = new ChromeDriver();
  }



  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    driver.close();
  }
}
