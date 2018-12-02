package ru.paa.litecart.customers.tests;

import org.testng.annotations.Test;
import ru.paa.litecart.customers.model.CustomerData;

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
