package banking;

public class Customer {

  private Account  account;
  private String   firstName;
  private String   lastName;

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
        return firstName;
  }
  public String getLastName() {
        return lastName;
  }
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }
}
