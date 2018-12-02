package ru.paa.litecart.customers.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver driver;

  private NavigationHelper navigationHelper;
  private CustomerHelper customerHelper;
  private SessionHelper sessionHelper;

  public void init() {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    customerHelper = new CustomerHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "admin");
  }


  public void stop() {
    driver.quit();
  }

  public CustomerHelper getCustomerHelper() {
    return customerHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
