package idatt.idi.ntnu.edu;

/**
 * Represents an event with details such as ID, name, location, organizer, type, and time.
 */
public class Event {
  private int id;
  private String name;
  private String location;
  private String organizer;
  private String type;
  private long time; // Format: yyyymmddhhmm

  /**
   * Constructs an Event with the specified details.
   *
   * @param id the Event ID
   * @param name the name of the Event
   * @param location the location where the Event is held
   * @param organizer the organizer of the Event
   * @param type the type of the Event
   */
  public Event(int id, String name, String location, String organizer, String type, long time) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.organizer = organizer;
    this.type = type;
    this.time = time;
  }

  //Getters
  public int getId() { 
    return id; 
  }

  public String getName() { 
    return name; 
  }

  public String getLocation() { 
    return location; 
  }

  public String getOrganizer() { 
    return organizer; 
  }

  public String getType() { 
    return type; 
  }

  public long getTime() { 
    return time; 
  }

  @Override
  public String toString() {
    return String.format("ID: %d, Name: %s, Location: %s, Organizer: %s, Type: %s, Time: %d",
                          id, name, location, organizer, type, time);
  }
}
