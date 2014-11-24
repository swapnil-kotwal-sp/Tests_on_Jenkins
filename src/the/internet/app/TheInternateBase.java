package the.internet.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.test.utils.Utility;

public class TheInternateBase {

  public static WebDriver driver;
  public static Utility utility;

  @BeforeSuite
  public void beforeSuite() {
    driver = new FirefoxDriver();
    driver.get("http://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    utility = new Utility(driver);
  }

  @AfterSuite
  public void afterSuite() {
    // close browser
    driver.quit();
  }

  protected static WebDriver getDriver() {
    return driver;
  }
  
  protected static Utility getUtility() {
    return utility;
  }
}
