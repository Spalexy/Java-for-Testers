package ru.paa.litecart.customers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
  public WebDriver driver;

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

  protected void submitForm() {
    driver.findElement(By.name("save")).click();
  }

  protected void fillNewCustomerForm(CustomerData customerData) {
    driver.findElement(By.name("code")).click();
    driver.findElement(By.name("code")).sendKeys(customerData.getCode());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(customerData.getEmail());
    driver.findElement(By.name("tax_id")).click();
    driver.findElement(By.name("tax_id")).sendKeys(customerData.getTaxId());
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys(customerData.getCompany());
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(customerData.getFirstname());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys(customerData.getLastname());
    driver.findElement(By.name("address1")).click();
    driver.findElement(By.name("address1")).sendKeys(customerData.getAddress1());
    driver.findElement(By.name("address2")).click();
    driver.findElement(By.name("address2")).sendKeys(customerData.getAddress2());
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).sendKeys(customerData.getCity());
    driver.findElement(By.name("postcode")).click();
    driver.findElement(By.name("postcode")).sendKeys(customerData.getPostcode());
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).sendKeys(customerData.getPhone());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(customerData.getMobile());
    driver.findElement(By.name("new_password")).click();
    driver.findElement(By.name("new_password")).sendKeys(customerData.getPassword());
  }

  protected void initCustomerCreation() {
    driver.findElement(By.linkText("Add New Customer")).click();
  }

  protected void goToCustomersPage() {
    driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
  }

  protected void editCustomer() {
    driver.findElement(By.cssSelector("i.fa.fa-pencil")).click();
  }

  protected void deleteCustomer() {
    driver.findElement(By.name("delete")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
  }

}
