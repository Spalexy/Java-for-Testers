package ru.paa.litecart.customers.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.paa.litecart.customers.model.CustomerData;

public class CustomerHelper {
  private WebDriver driver;

  public CustomerHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void submitForm() {
    driver.findElement(By.name("save")).click();
  }

  public void fillNewCustomerForm(CustomerData customerData) {
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

  public void initCustomerCreation() {
    driver.findElement(By.linkText("Add New Customer")).click();
  }

  public void editCustomer() {
    driver.findElement(By.cssSelector("i.fa.fa-pencil")).click();
  }

  public void deleteCustomer() {
    driver.findElement(By.name("delete")).click();
  }
}
