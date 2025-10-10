import java.util.Scanner;

/**
 * Client program for testing the Employee class.
 */
public class EmployeeClient {
  /**
   * The main method to run the Employee client program.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Initialize Person
    System.out.print("Enter first name: ");
    String firstName = scanner.nextLine();

    System.out.print("Enter last name: ");
    String lastName = scanner.nextLine();

    System.out.print("Enter year of birth: ");
    int yearOfBirth = Integer.parseInt(scanner.nextLine());

    Person person = new Person(firstName, lastName, yearOfBirth);

    // Initialize employee
    System.out.print("Enter employee number: ");
    int employeeNumber = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter year of employment: ");
    int yearOfEmployment = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter monthly salary: ");
    double monthlySalary = Double.parseDouble(scanner.nextLine());

    System.out.print("Enter tax percentage: ");
    double taxPercentage = Double.parseDouble(scanner.nextLine());

    Employee employee = new Employee(person, employeeNumber, yearOfEmployment,
                                    monthlySalary, taxPercentage);

    boolean run = true;
    while (run) {
      System.out.println("\n--- Employee Information ---");
      System.out.println(employee);

      System.out.println("\nMenu:");
      System.out.println("1. Change monthly salary");
      System.out.println("2. Change tax rate");
      System.out.println("3. Show tax deducted per month");
      System.out.println("4. Show gross annual salary");
      System.out.println("5. Show annual tax deduction");
      System.out.println("6. Show full name (last name, first name)");
      System.out.println("7. Show age");
      System.out.println("8. Show years employed");
      System.out.println("9. Check if employed more than X years");
      System.out.println("0. Exit");
      System.out.print("Choose an option: ");

      int choice = Integer.parseInt(scanner.nextLine());

      switch (choice) {
        case 1:
          System.out.print("Enter new monthly salary: ");
          double newSalary = Double.parseDouble(scanner.nextLine());
          employee.setMonthlySalary(newSalary);
          break;
        case 2:
          System.out.print("Enter new tax rate: ");
          double newTaxRate = Double.parseDouble(scanner.nextLine());
          employee.setTaxRate(newTaxRate);
          break;
        case 3:
          System.out.printf("Tax deducted per month: %.2f kr\n", employee.monthlyDeductedTax());
          break;
        case 4:
          System.out.printf("Gross annual salary: %.2f kr\n", employee.grossSalary());
          break;
        case 5:
          System.out.printf("Annual tax deduction: %.2f kr\n", employee.anualDeductedTax());
          break;
        case 6:
          System.out.println("Full name: " + employee.getEmployeeName());
          break;
        case 7:
          System.out.println("Age: " + employee.getEmployeeAge());
          break;
        case 8:
          System.out.println("Years employed: " + employee.yearsInFirm());
          break;
        case 9:
          System.out.print("Enter number of years: ");
          int years = Integer.parseInt(scanner.nextLine());
          if (employee.hasBeenEmployedLongerThan(years)) {
            System.out.println("The employee has been employed for more than " + years + " years.");
          } else {
            System.out.println("The employee has NOT been employed for more than " 
                              + years + " years.");
          }
          break;
        case 0:
          run = false;
          break;
        default:
          System.out.println("Invalid option.");
      }
    }

    System.out.println("\nQuitting program ...");
    scanner.close();
  }
}