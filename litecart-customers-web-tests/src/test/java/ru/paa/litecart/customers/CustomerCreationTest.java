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
    login("admin", "admin");
  }

  private void login(String username, String password) {
    driver.get("http://localhost/litecart/admin/login.php");
    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.name("login")).click();
  }

  @Test
  public void testCustomerCreation() throws Exception {
    goToCustomersPage();
    initCustomerCreation();
    fillNewCustomerForm("test", "test@test.ru", "test", "test",
            "test", "test", "test", "test", "test",
            "test", "1234567", "1234567", "test");
    submitForm();
  }

  private void submitForm() {
    driver.findElement(By.name("save")).click();
  }

  private void fillNewCustomerForm(String code, String email, String taxId, String company, String firstname,
                                   String lastname, String address1, String address2, String city, String postcode,
                                   String phone, String mobile, String password) {
    driver.findElement(By.name("code")).click();
    driver.findElement(By.name("code")).sendKeys(code);
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(email);
    driver.findElement(By.name("tax_id")).click();
    driver.findElement(By.name("tax_id")).sendKeys(taxId);
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys(company);
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(firstname);
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys(lastname);
    driver.findElement(By.name("address1")).click();
    driver.findElement(By.name("address1")).sendKeys(address1);
    driver.findElement(By.name("address2")).click();
    driver.findElement(By.name("address2")).sendKeys(address2);
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).sendKeys(city);
    driver.findElement(By.name("postcode")).click();
    driver.findElement(By.name("postcode")).sendKeys(postcode);
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).sendKeys(phone);
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(mobile);
    driver.findElement(By.name("new_password")).click();
    driver.findElement(By.name("new_password")).sendKeys(password);
  }

  private void initCustomerCreation() {
    driver.findElement(By.linkText("Add New Customer")).click();
  }


  private void goToCustomersPage() {
    driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
  }

}
