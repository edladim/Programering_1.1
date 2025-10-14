package idatt.idi.ntnu.edu;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EventRegisterTest {
  private EventRegister register;
  private Event event1;
  private Event event2;
  private Event event3;

  @BeforeEach
  void setUp() {
    register = new EventRegister();
    event1 = new Event(1, "Rockefest", "Oslo", "Oslo Musikkforening", "Musikk", 1760727600000L);
    event2 = new Event(2, "Solbarna", "Bergen", "Bergen Byteater", "Teater", 1761348000000L);
    event3 = new Event(3, "Fremtidens Teknologi", "Oslo", "NTNU", "Foredrag", 1761967200000L);
    register.addEvent(event1);
    register.addEvent(event2);
    register.addEvent(event3);
  }

  @Test
  void testAddEvent() {
    Event event = new Event(4, "Utstilling", "Trondheim", "Kunstnerforbundet", "Kunst", 1761967200000L);
    register.addEvent(event);
    assertTrue(register.getAllEvents().contains(event));
  }

  @Test
  void testGetAllEvents() {
    List<Event> all = register.getAllEvents();
    assertEquals(3, all.size());
    assertTrue(all.contains(event1));
    assertTrue(all.contains(event2));
    assertTrue(all.contains(event3));
  }

  @Test
  void testGetEventsByLocation() {
    List<Event> osloEvents = register.getAllEventsAtLocation("Oslo");
    assertEquals(2, osloEvents.size());
    assertTrue(osloEvents.contains(event1));
    assertTrue(osloEvents.contains(event3));
  }

  @Test
  void testGetEventsByDate() {
    List<Event> dateEvents = register.getAllEventsAtDate(176072760L);
    assertEquals(1, dateEvents.size());
    assertEquals(event1, dateEvents.get(0));
  }

  @Test
  void testGetEventsInInterval() {
    List<Event> intervalEvents = register.getEventsInDateInterval(1760727600000L, 1761348000000L);
    assertEquals(2, intervalEvents.size());
    assertTrue(intervalEvents.contains(event1));
    assertTrue(intervalEvents.contains(event2));
  }

  @Test
  void testGetEventsSortedByLocation() {
    List<Event> sorted = register.getEventsSortedByLocation();
    assertEquals(3, sorted.size());
    assertEquals("Bergen", sorted.get(0).getLocation());
    assertEquals("Oslo", sorted.get(1).getLocation());
    assertEquals("Oslo", sorted.get(2).getLocation());
  }

  @Test
  void testGetEventsSortedByType() {
    List<Event> sorted = register.getEventsSortedByType();
    assertEquals(3, sorted.size());
    assertEquals("Foredrag", sorted.get(0).getType());
    assertEquals("Musikk", sorted.get(1).getType());
    assertEquals("Teater", sorted.get(2).getType());
}
}
