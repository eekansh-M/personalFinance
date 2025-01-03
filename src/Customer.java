import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer with banking and points information.
 */
public class Customer {
  private String firstName;
  private String lastName;
  private String username;
  private String password;
  private double bankBalance;
  private int points;
  private List<Transaction> transactionsList;

  /**
   * Constructs a new Customer with initial values.
   * @param firstName The customer's first name
   * @param lastName The customer's last name
   * @param username The customer's username
   * @param password The customer's password
   * @param bankBalance The customer's initial bank balance
   */
  public Customer(String firstName, String lastName, String username, String password, double bankBalance) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.bankBalance = bankBalance;
    this.points = 0;
    this.transactionsList = new ArrayList<Transaction>();
  }

  /**
   * Gets the customer's last name.
   * @return The last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the customer's last name.
   * @param lastName The new last name
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets the customer's first name.
   * @return The first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the customer's first name.
   * @param firstName The new first name
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the customer's username.
   * @return The username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Sets the customer's username.
   * @param username The new username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Gets the customer's bank balance.
   * @return The bank balance
   */
  public double getBankBalance() {
    return bankBalance;
  }

  /**
   * Sets the customer's bank balance.
   * @param bankBalance The new bank balance
   */
  public void setBankBalance(double bankBalance) {
    this.bankBalance = bankBalance;
  }

  /**
   * Gets the customer's points.
   * @return The points
   */
  public int getPoints() {
    return points;
  }

  /**
   * Sets the customer's points.
   * @param points The new points value
   */
  public void setPoints(int points) {
    this.points = points;
  }

  /**
   * Sets the customer's password.
   * @param password The new password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Gets the list of all transactions.
   * @return The list of transactions
   */
  public List<Transaction> getTransactionsList() {
    return transactionsList;
  }

  /**
   * Retrieves all transactions for a specific month and year.
   * @param month The month to filter by
   * @param year The year to filter by
   * @return A list of transactions matching the specified month and year
   */
  public List<Transaction> getTransactionByMonth(int month, int year) {
    ArrayList<Transaction> transactionsByMonth = new ArrayList<>();
    for (int i = 0; i < transactionsList.size(); i++) {
      if (transactionsList.get(i).getTransactionMonth() == month
              && transactionsList.get(i).getTransactionYear() == year) {
        transactionsByMonth.add(transactionsList.get(i));
      }
    }
    return transactionsByMonth;
  }
}