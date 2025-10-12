
package idatt.idi.ntnu.edu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {
  @Test
  void testConstructorAndGetters() {
    Student student = new Student("Ola", 3);
    assertEquals("Ola", student.getName());
    assertEquals(3, student.getNumberOfTasks());
  }

  @Test
  void testIncreaseNumberOfTasks() {
    Student student = new Student("Kari", 2);
    student.increaseNumberOfTasks(5);
    assertEquals(7, student.getNumberOfTasks());
  }

  @Test
  void testToString() {
    Student student = new Student("Per", 4);
    assertEquals("Per (4 completed tasks)", student.toString());
  }
}
