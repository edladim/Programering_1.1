package idatt.idi.ntnu.edu;

import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * A register for managing events.
 */
public class EventRegister {
  private List<Event> events = new ArrayList<>();

  public void registerNewevent(Event event) {
    events.add(event);
  }

  
  /**
   * Returns a list of all events at the specified location.
   *
   * @param location the location to filter events by
   * @return a list of events at the given location
   */
  public List<Event> getAllEventsAt(String location) {
    return events.stream()
        .filter((event) -> event.getLocation()
        .equalsIgnoreCase())
        .collect(Collectors.toList());
  }

}