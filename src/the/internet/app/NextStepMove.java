package the.internet.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.test.utils.Utility;

public class NextStepMove extends TheInternateBase{
  
  private WebDriver driver;
  private Utility utility;
  private String path = ".//*[@id='content']/ul";

  @BeforeSuite
  public void setTestSuite() {
    this.driver = super.getDriver();
    this.utility = super.getUtility();
  }
  

  @Test(priority = 4)
  private void changingDom() throws InterruptedException {
    driver.findElement(By.xpath(path + "/li[5]/a")).click();
    // WebElement fooBtn = (new WebDriverWait(driver, 10)
    // .until(ExpectedConditions.presenceOfElementLocated(By
    // .id(".//*[@id='content']/div/img[3]"))));
    driver.navigate().back();
  }
}
