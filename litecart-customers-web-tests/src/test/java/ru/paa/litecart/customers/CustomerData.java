package ru.paa.litecart.customers;

public class CustomerData {
  private final String code;
  private final String email;
  private final String taxId;
  private final String company;
  private final String firstname;
  private final String lastname;
  private final String address1;
  private final String address2;
  private final String city;
  private final String postcode;
  private final String phone;
  private final String mobile;
  private final String password;

  public CustomerData(String code, String email, String taxId, String company, String firstname, String lastname,
                      String address1, String address2, String city, String postcode, String phone,
                      String mobile, String password) {
    this.code = code;
    this.email = email;
    this.taxId = taxId;
    this.company = company;
    this.firstname = firstname;
    this.lastname = lastname;
    this.address1 = address1;
    this.address2 = address2;
    this.city = city;
    this.postcode = postcode;
    this.phone = phone;
    this.mobile = mobile;
    this.password = password;
  }

  public String getCode() {
    return code;
  }

  public String getEmail() {
    return email;
  }

  public String getTaxId() {
    return taxId;
  }

  public String getCompany() {
    return company;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress1() {
    return address1;
  }

  public String getAddress2() {
    return address2;
  }

  public String getCity() {
    return city;
  }

  public String getPostcode() {
    return postcode;
  }

  public String getPhone() {
    return phone;
  }

  public String getMobile() {
    return mobile;
  }

  public String getPassword() {
    return password;
  }
}
