/**
 * Represents a transaction with date information.
 */
public class Transaction {
  private String transactionName;
  private int transactionMonth;
  private int transactionDay;
  private int transactionYear;

  /**
   * Constructs a new Transaction with the specified details.
   * @param transactionName The name/description of the transaction
   * @param transactionMonth The month when the transaction occurred
   * @param transactionDay The day when the transaction occurred
   * @param transactionYear The year when the transaction occurred
   */
  public Transaction(String transactionName, int transactionMonth, int transactionDay, int transactionYear) {
    this.transactionName = transactionName;
    this.transactionMonth = transactionMonth;
    this.transactionDay = transactionDay;
    this.transactionYear = transactionYear;
  }

  /**
   * Gets the transaction name/description.
   * @return The transaction name
   */
  public String getTransactionName() {
    return transactionName;
  }

  /**
   * Gets the month when the transaction occurred.
   * @return The transaction month
   */
  public int getTransactionMonth() {
    return transactionMonth;
  }

  /**
   * Gets the day when the transaction occurred.
   * @return The transaction day
   */
  public int getTransactionDay() {
    return transactionDay;
  }

  /**
   * Gets the year when the transaction occurred.
   * @return The transaction year
   */
  public int getTransactionYear() {
    return transactionYear;
  }
}