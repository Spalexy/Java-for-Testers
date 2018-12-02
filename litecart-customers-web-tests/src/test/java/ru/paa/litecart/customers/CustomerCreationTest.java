package ru.paa.litecart.customers;

import org.testng.annotations.Test;

public class CustomerCreationTest extends TestBase {

  @Test
  public void testCustomerCreation() throws Exception {
    app.goToCustomersPage();
    app.initCustomerCreation();
    app.fillNewCustomerForm(
            new CustomerData("test", "test@test.ru", "test",
                    "test", "test", "test", "test",
                    "test", "test", "test", "1234567",
                    "1234567", "test"));
    app.submitForm();
  }
}
