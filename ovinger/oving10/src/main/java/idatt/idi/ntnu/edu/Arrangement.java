package idatt.idi.ntnu.edu;

/**
 * Represents an arrangement with details such as ID, name, place, organizer, type, and time.
 */
public class Arrangement {
  private int id;
  private String name;
  private String place;
  private String organizer;
  private String type;
  private long time;

  /**
   * Constructs an Arrangement with the specified details.
   *
   * @param id the arrangement ID
   * @param name the name of the arrangement
   * @param place the place where the arrangement is held
   * @param organizer the organizer of the arrangement
   * @param type the type of the arrangement
   */
  public Arrangement(int id, String name, String place, String organizer, String type) {
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
  public String toString(){
    return String.format("ID: %d, Name: %s, Location: %s, Organizer: %s, Type: %s, Time: %d",
                          id, name, location, organizer, type, time);
  }
}
