package idatt.idi.ntnu.edu;

/**
 * Represents an overview of students and their completed tasks.
 */
public class TaskOverview {

  private Student[] students;
  private int numberOfStudents;

  /**
   * Constructs a TaskOverview with a specified maximum number of students.
   *
   * @param maxNumberOfStudents the maximum number of students
   */
  public TaskOverview(int maxNumberOfStudents) {
    this.students = new Student[maxNumberOfStudents];
    this.numberOfStudents = 0; 
  }

  /**
   * Returns the current number of registered students.
   *
   * @return the current number of registered students
   */
  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  /**
   * Returns the number of completed tasks for a student with the specified name.
   *
   * @param name the name of the student
   * @return the number of completed tasks, or -1 if the student was not found
   */
  public int numberOfCompletedTasks(String name) {
    for (Student student : students) {
      if (student != null && student.getName().equals(name)) {
        return student.getNumberOfTasks();
      }
    }
    return -1; // ikke funnet
  }

  /**
   * Registers a new student with the specified name.
   *
   * @param name the name of the student
   * @return true if the student was successfully registered, false if the student
   *         already exists or if the maximum number of students has been reached
   */ 
  public boolean registerNewStudent(String name) {
    if (numberOfStudents >= students.length) {
      return false; // fullt
    }
    for (Student student : students) {
      if (student != null && student.getName().equals(name)) {
        return false; // allerede registrert
      }
    }
    students[numberOfStudents] = new Student(name);
    numberOfStudents++;
    return true;
  }

  /**
   * Increases the number of completed tasks for a student by a specified amount.
   *
   * @param name the name of the student
   * @param by   the number of tasks to increase
   * @return true if the student was found and updated, false otherwise
   */
  public boolean increaseNumberOfTasks(String name, int by) {
    for (Student student : students) {
      if (student != null && student.getName().equals(name)) {
        student.increaseNumberOfTasks(by);
        return true;
      }
    }
    return false; // ikke funnet
  }

  /**
   * Returns a string representation of all students and their completed tasks.
   *
   * @return a string representation of all students
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numberOfStudents; i++) {
      sb.append(students[i].toString()).append("\n");
    }
    return sb.toString(); 
  }
}