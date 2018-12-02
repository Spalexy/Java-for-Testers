package ru.paa.litecart.customers;

import org.testng.annotations.Test;

public class CustomerDeletionTest extends TestBase {

  @Test
  public void testCustomerDeletion() {
    app.goToCustomersPage();
    app.editCustomer();
    app.deleteCustomer();
  }


}
