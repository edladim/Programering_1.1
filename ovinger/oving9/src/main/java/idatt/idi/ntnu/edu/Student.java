package idatt.idi.ntnu.edu;

/**
 * Represents a student with a name and a number of completed tasks.
 */
public class Student {
  
  private String name;
  private int numberOfTasks;

  /**
   * Constructs a Student with the specified name and number of completed tasks.
   *
   * @param name the name of the student
   */
  public Student(String name) {
    this.name = name;
    this.numberOfTasks = 0;
  }

  // Getters

  /**
   * Returns the name of the student.
   *
   * @return the name of the student
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the number of completed tasks.
   *
   * @return the number of completed tasks
   */
  public int getNumberOfTasks() {
    return numberOfTasks;
  }

  // Other methods

  /**
   * Increases the number of completed tasks by a specified amount.
   */
  public void increaseNumberOfTasks(int by) {
    this.numberOfTasks += by;
  }

  /**
   * Returns a string representation of the student.
   *
   * @return a string representation of the student
   */
  @Override
  public String toString() {
    return this.name + " (" + this.numberOfTasks + " completed tasks)";
  }
}
