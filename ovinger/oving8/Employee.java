import java.util.GregorianCalendar;

/**
 * Employee class representing an employee with basic attributes.
 */
public class Employee {
  private final Person personalia;
  private final int employeeNumber;
  private final int yearHired;
  private double monthlySalary;
  private double taxRate;

  /**
   * Constructs a new employee with the specified details.
   *
   * @param personalia the personal details of the employee
   * @param employeeNumber the employee number
   * @param yearHired the year the employee was hired
   * @param monthlySalary the monthly salary of the employee
   * @param taxRate the tax rate of the employee
   */
  public Employee(Person personalia,
                  int employeeNumber,
                  int yearHired,
                  double monthlySalary,
                  double taxRate) {
    this.personalia = personalia;
    this.employeeNumber = employeeNumber;
    this.yearHired = yearHired;
    this.monthlySalary = monthlySalary;
    this.taxRate = taxRate;
  }

  // Getters
  /**
   * Returnes the personalia of the employee.
   *
   * @return the personalia (Person object)
   */
  public Person getPersonalia() {
    return personalia;
  }

  /**
   * Returns the employee number.
   *
   * @return the employee number
   */
  public int getEmployeeNumber() {
    return employeeNumber;
  }

  /**
   * Returns the year the employee was hired.
   *
   * @return the year hired
   */
  public int getYearHired() {
    return yearHired;
  }

  /**
   * Returns the monthly salary of the employee.
   *
   * @return the monthly salary
   */
  public double getMonthlySalary() {
    return monthlySalary;
  }

  /**
   * Returns the tax rate of the employee.
   *
   * @return the tax rate
   */
  public double getTaxRate() {
    return taxRate;
  }

  // Setters

  /**
   * Sets the the monthly salary for the employee.
   *
   * @param monthlySalary the new monthly salary
   */
  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }
  
  /**
   * Sets the tax rate for the employee.
   *
   * @param taxRate the new tax rate
   */
  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }

  // Other methods

  /**
   * Calculates the tax deducted per month.
   *
   * @return the tax deducted per month (in kroner)
   */
  public double monthlyDeductedTax() {
    return monthlySalary * taxRate / 100.0;
  }

  /**
   * Calculates gross anual salary.
   *
   * @return gross anual salary
   */
  public double grossSalary() {
    return monthlySalary * 12;
  }

  /**
   * Calculates anual deducted tax.
   *
   * @return anual deducted tax
   */
  public double anualDeductedTax() {
    return monthlyDeductedTax() * 10.5;
  }

  /**
   * Returnes the employees name in the fromat: "Last name, first name".
   *
   * @return name in the fromat: "Last name, first name"
   */
  public String getEmployeeName() {
    return personalia.getLastName() + ", " + personalia.getLastName();
  }

  /**
   * Returns age of the employee.
   *
   * @return age in years
   */
  public int getEmployeeAge() {
    int currentYear = new GregorianCalendar().get(java.util.Calendar.YEAR);
    return currentYear - personalia.getYearOfBirth();
  }

  /**
   * Number of years in the firm.
   *
   * @return number of years in the firm
   */
  public int yearsInFirm() {
    int currentYear = new GregorianCalendar().get(java.util.Calendar.YEAR);
    return currentYear - yearHired;
  }

  /**
   * Checks if the employee has been employed for more than the given number of years.
   *
   * @param year the number of years to check
   * @return true if employed for more than the given years, false otherwise
   */
  public boolean hasBeenEmployedLongerThan(int year) {
    return yearsInFirm() > year;
  }

  /**
   * Returns a string representation of the employee.
   *
   * @return string representation of the employee
   */
  public String toString() {
    return "Employee{" 
            + "personalia = " 
            + personalia.getFirstName() + " " 
            + personalia.getLastName() + " " 
            + personalia.getYearOfBirth()
            + ", employeeNumber = " + employeeNumber 
            + ", yearHired = " + yearHired 
            + ", monthlySalary = " + monthlySalary 
            + ", taxRate = " + taxRate 
            + '}';
  }
}