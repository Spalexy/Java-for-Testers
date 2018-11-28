package ru.paa.litecart.customers;

import org.testng.annotations.Test;

public class CustomerCreationTest extends TestBase {

  @Test
  public void testCustomerCreation() throws Exception {
    goToCustomersPage();
    initCustomerCreation();
    fillNewCustomerForm(
            new CustomerData("test", "test@test.ru", "test",
                    "test", "test", "test", "test",
                    "test", "test", "test", "1234567",
                    "1234567", "test"));
    submitForm();
  }
}
