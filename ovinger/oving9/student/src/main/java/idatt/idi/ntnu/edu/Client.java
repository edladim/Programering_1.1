package idatt.idi.ntnu.edu;

import java.util.Scanner;

/**
 * Client class to demonstrate the functionality of TaskOverview and Student classes.
 */
public class Client {

  /**
   * Main method to run the client application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    TaskOverview overview = new TaskOverview(10);

    overview.registerNewStudent("Ola");
    overview.registerNewStudent("Kari");

    overview.increaseNumberOfTasks("Ola", 2);
    overview.increaseNumberOfTasks("Kari", 5);

    System.out.println(overview);

    System.out.println("Antall studenter: " + overview.getNumberOfStudents());
    System.out.println("Kari har levert: " 
                      + overview.numberOfCompletedTasks("Kari") + " oppgaver.");

    // Enkel interaktiv test
    Scanner sc = new Scanner(System.in);
    System.out.print("Legg til ny student: ");
    String navn = sc.nextLine();
    if (overview.registerNewStudent(navn)) {
      System.out.println("Registrert!");
    } else {
      System.out.println("Kunne ikke registrere student.");
    }
    sc.close();
    System.out.println(overview);
  }
}
