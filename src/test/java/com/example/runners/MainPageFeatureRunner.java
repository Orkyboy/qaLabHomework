package com.example.runners;

/**
 * Created by pavellebed on 11/1/16.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/resources/steps/MainPage.feature",
        glue = "src.test.java.com.example.steps",
        format = {"pretty"})
public class MainPageFeatureRunner extends AbstractTestNGCucumberTests {
}
