package idatt.idi.ntnu.edu;

import java.util.List;
import java.util.Scanner;

/**
 * Client class for interacting with the ArrangementRegister.
 */
public class Client {

  private static ArrangementRegister register = new ArrangementRegister();
  private static Scanner scanner = new Scanner(System.in);

  /**
   * The main method to run the ArrangementClient application.
   * Handles user interaction and menu navigation.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    boolean running = true;
    while (running) {
      printMenu();
      String choice = scanner.nextLine().trim();
      switch (choice) {
        case "1" -> registerArrangement();
        case "2" -> showArrangementsByLocation();
        case "3" -> showArrangementsByDate();
        case "4" -> showArrangementsInInterval();
        case "5" -> showArrangementsSortedByLocation();
        case "6" -> showArrangementsSortedByType();
        case "7" -> showArrangementsSortedByTime();
        case "8" -> showAllArrangements();
        case "0" -> running = false;
        default -> System.out.println("Invalid choice. Try again.");
      }
    }
  }
}
