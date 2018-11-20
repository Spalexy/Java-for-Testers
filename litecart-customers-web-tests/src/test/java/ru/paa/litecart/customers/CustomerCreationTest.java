package ru.paa.litecart.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CustomerCreationTest {
  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCustomerCreation() throws Exception {
    driver.get("http://localhost/litecart/admin/login.php");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("login")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
    driver.findElement(By.linkText("Add New Customer")).click();
    driver.findElement(By.name("code")).click();
    driver.findElement(By.name("code")).sendKeys("test");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("test@test.ru");
    driver.findElement(By.name("tax_id")).click();
    driver.findElement(By.name("tax_id")).sendKeys("test");
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys("test");
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("test");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("test");
    driver.findElement(By.name("address1")).click();
    driver.findElement(By.name("address1")).sendKeys("test");
    driver.findElement(By.name("address2")).click();
    driver.findElement(By.name("address2")).sendKeys("test");
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).sendKeys("test");
    driver.findElement(By.name("postcode")).click();
    driver.findElement(By.name("postcode")).sendKeys("test");
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).sendKeys("1234567");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys("1234567");
    driver.findElement(By.name("new_password")).click();
    driver.findElement(By.name("new_password")).sendKeys("test");
    driver.findElement(By.name("save")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
  }

}
