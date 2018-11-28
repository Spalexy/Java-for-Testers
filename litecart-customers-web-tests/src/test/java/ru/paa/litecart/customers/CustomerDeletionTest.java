package ru.paa.litecart.customers;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class CustomerDeletionTest {
  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCustomerDeletion() {
    driver.get("http://localhost/litecart/admin/login.php");
    driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.xpath("//div[@id='box-login']/form/div")).click();
    driver.findElement(By.name("login")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Currencies'])[1]/following::span[2]")).click();
    driver.findElement(By.cssSelector("i.fa.fa-pencil")).click();
    driver.findElement(By.name("delete")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }


}
