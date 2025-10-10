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
  public void setMonthlySalary(int monthlySalary) {
    this.monthlySalary = monthlySalary;
  }
  
  /**
   * Sets the tax rate for the employee.
   *
   * @param taxRate the new tax rate
   */
  public void setTaxRate(int taxRate) {
    this.taxRate = taxRate;
  }


  
}
