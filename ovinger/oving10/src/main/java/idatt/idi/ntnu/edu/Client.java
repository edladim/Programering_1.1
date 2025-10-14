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
        case "1" -> createEvent();
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

  private static void printMenu() {
    System.out.println("\n--- Event Register ---");
    System.out.println("1. Create new arrangement");
    System.out.println("2. Find arrangements by location");
    System.out.println("3. Find arrangements by date");
    System.out.println("4. Find arrangements in time interval");
    System.out.println("5. List all arrangements sorted by location");
    System.out.println("6. List all arrangements sorted by type");
    System.out.println("7. List all arrangements sorted by time");
    System.out.println("8. Show all arrangements");
    System.out.println("0. Exit");
    System.out.print("Choice: ");
  }

  private static void createEvent() {
    try {
      System.out.print("ID: ");
      int id = Integer.parseInt(scanner.nextLine().trim());
      System.out.print("Name: ");
      String name = scanner.nextLine().trim();
      System.out.print("Location: ");
      String location = scanner.nextLine().trim();
      System.out.print("Organizer: ");
      String organizer = scanner.nextLine().trim();
      System.out.print("Type (concert, theatre, lecture etc): ");
      String type = scanner.nextLine().trim();
      System.out.print("Time (yyyymmddhhmm): ");
      long time = Long.parseLong(scanner.nextLine().trim());
      Event arrangement = new Event(id, name, location, organizer, type, time);
      register.addEvent(arrangement);
      System.out.println("Event registered.");
    } catch (Exception e) {
      System.out.println("Invalid input. Event not registered.");
    }
  }

  private static void showEventsByLocation() {
    System.out.print("Enter location: ");
    String location = scanner.nextLine().trim();
    List<Event> list = register.getAllEventsAtLocation(location);
    printEvents(list);
  }

  private static void showEventsByDate() {
    System.out.print("Enter date (yyyymmdd): ");
    try {
      int date = Integer.parseInt(scanner.nextLine().trim());
      List<Event> list = register.getAllEventsAtDate(date);
      printEvents(list);
    } catch (Exception e) {
      System.out.println("Invalid date format.");
    }
  }

  private static void showEventsInInterval() {
    try {
      System.out.print("From time (yyyymmddhhmm): ");
      long from = Long.parseLong(scanner.nextLine().trim());
      System.out.print("To time (yyyymmddhhmm): ");
      long to = Long.parseLong(scanner.nextLine().trim());
      List<Event> list = register.getEventsInDateInterval(from, to);
      printEvents(list);
    } catch (Exception e) {
      System.out.println("Invalid input.");
    }
  }

  private static void showEventsSortedByLocation() {
    List<Event> list = register.getEventsSortedByLocation();
    printEvents(list);
  }

  private static void showEventsSortedByType() {
    List<Event> list = register.getEventsSortedByType();
    printEvents(list);
  }

  private static void showEventsSortedByTime() {
    List<Event> list = register.getEventsSortedByTime();
    printEvents(list);
  }

  private static void showAllEvents() {
    List<Event> list = register.getAllEvents();
    printEvents(list);
  }

  private static void printEvents(List<Event> list) {
    if (list.isEmpty()) {
      System.out.println("No arrangements found.");
    } else {
      list.forEach(System.out::println);
    }
  }
}

