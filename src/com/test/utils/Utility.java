package com.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
  WebDriver driver;
  
  public Utility(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement isElementPresent(String string, int i) {
    return (new WebDriverWait(driver, 10)
    .until(ExpectedConditions.presenceOfElementLocated(By
        .id("loginPage-email"))));    
  }
}
