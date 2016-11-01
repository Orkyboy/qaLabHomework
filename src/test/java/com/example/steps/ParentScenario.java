package com.example.steps;

/**
 * Created by pavellebed on 11/1/16.
 */
import com.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class ParentScenario {

    public WebDriver driver;

    protected HomePage homePage;

    protected void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        System.out.println();
    }

    protected void navigateTo() {
        driver.navigate().to("http://docs.seleniumhq.org/");
    }

    protected void closeBrowser() {
        driver.quit();
    }

}
