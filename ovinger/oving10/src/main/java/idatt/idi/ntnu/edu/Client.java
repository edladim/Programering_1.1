package idatt.idi.ntnu.edu;

import java.util.List;
import java.util.Scanner;

/**
 * Client class for interacting with the EventRegister.
 */
public class Client {

  private static EventRegister register = new EventRegister();
  private static Scanner scanner = new Scanner(System.in);

  /**
   * The main method to run the EventClient application.
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
        case "1" -> addEvent();
        case "2" -> showEventsByLocation();
        case "3" -> showEventsByDate();
        case "4" -> showEventsInInterval();
        case "5" -> showEventsSortedByLocation();
        case "6" -> showEventsSortedByType();
        case "7" -> showEventsSortedByTime();
        case "8" -> showAllEvents();
        case "0" -> running = false;
        default -> System.out.println("Invalid choice. Try again.");
      }
    }
  }
}
