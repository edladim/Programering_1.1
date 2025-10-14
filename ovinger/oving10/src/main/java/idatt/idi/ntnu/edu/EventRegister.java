package idatt.idi.ntnu.edu;

import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/**
 * A register for managing events.
 */
public class EventRegister {
  private List<Event> events = new ArrayList<>();

  /**
   * Registers a new event.
   * @param event
   */
  public void addEvent(Event event) {
    events.add(event);
  }
  
  /**
   * Returns a list of all events at the specified location.
   *
   * @param location the location to filter events by
   * @return a list of events at the given location
   */
  public List<Event> getAllEventsAtLocation(String location) {
    return events.stream()
        .filter((event) -> event.getLocation()
        .equalsIgnoreCase(location))
        .collect(Collectors.toList());
  }

  /**
   * Returns a list of all events at the specified date.
   *
   * @param date the date to filter events by (format: yyyymmddhhmm)
   * @return a list of events at the given date
   */
  public List<Event> getAllEventsAtDate(long date) {
    return events.stream()
        .filter((event) -> event.getTime()
        .equals(date / 1000))
        .collect(Collectors.toList());
  }

  /**
   * Returns a list of all events within the specified date interval.
   *
   * @param fromDate the start date of the interval (format: yyyymmddhhmm)
   * @param toDate the end date of the interval (format: yyyymmddhhmm)
   * @return a list of events within the given date interval, sorted by time
   */
  public List<Event> getEventsInDateInterval(long fromDate, long toDate) {
    return events.stream()
        .filter((event) -> event.getTime() / 1000 >= fromDate && event.getTime() / 1000 <= toDate)
        .sorted(Comparator.comparingLong(Event::getTime()))
        .collect(Collectors.toList());
  }
  
  /**
   * Registers a new event.
   *
   * @param event the event to be registered
   */
  public List<Event> getEventsSortedByLocation() {
    return events.stream()
        .sorted(Comparator.comparing(Event::getLocation()))
        .collect(Collectors.toList());
  }

  /**
   * Registers a new event.
   *
   * @param event the event to be registered
   */
  public List<Event> getEventsSortedByType() {
    return events.stream()
        .sorted(Comparator.comparing(Event::getType()))
        .collect(Collectors.toList());
  }

  /**
   * Registers a new event.
   *
   * @param event the event to be registered
   */
  public List<Event> getEventsSortedByTime() {
    return events.stream()
        .sorted(Comparator.comparing(Event::getTime()))
        .collect(Collectors.toList());
  }

  /**
   * Registers a new event.
   *
   * @param event the event to be registered
   */
  public List<Arrangement> getAllArrangements() {
        return new ArrayList<>(arrangements);
    }
  
}