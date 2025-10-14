package idatt.idi.ntnu.edu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Test class for EventRegister.
 */
public class EventRegisterTest {
    
  @Test
  public void testRegisterNewEvent() {

    EventRegister eventRegister = new EventRegister();
    Event event = new Event(1, "Concert", "Oslo", "MusicOrg", "Music");
    eventRegister.registerNewEvent(event);
    assertTrue(eventRegister.getAllEventsAt("Oslo").contains(event));
  }
}
