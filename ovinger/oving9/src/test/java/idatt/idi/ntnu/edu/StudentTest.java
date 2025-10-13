
package idatt.idi.ntnu.edu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Student class.
 */
class StudentTest {
  @Test
  void testConstructorAndGetters() {
    Student student = new Student("Ola");
    student.increaseNumberOfTasks(3);
    assertEquals("Ola", student.getName());
    assertEquals(3, student.getNumberOfTasks());
  }

  @Test
  void testIncreaseNumberOfTasks() {
    Student student = new Student("Kari");
    student.increaseNumberOfTasks(2);
    student.increaseNumberOfTasks(5);
    assertEquals(7, student.getNumberOfTasks());
  }

  @Test
  void testToString() {
    Student student = new Student("Per");
    student.increaseNumberOfTasks(4);
    assertEquals("Per (4 completed tasks)", student.toString());
  }
}
