package idatt.idi.ntnu.edu;

class TaskOverview {

  private Student[] students;
  private int numberOfStudents;

  public TaskOverview(int maxNumberOfStudents) {
    this.students = new Student[maxNumberOfStudents];
    this.numberOfStudents = 0; 
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public int numberOfCompletedTasks(String name) {
    for (Student student : students) {
      if (student.getName().equals(name)) {
        return student.getNumberOfTasks();
      }
    }
    return -1; // ikke funnet
  }

  public boolean registerNewStudent(String name) {
    for (Student student : students) {
      if (student.getName().equals(name) || numberOfStudents >= students.length) {
        return false; // allerede registrert eller fullt
      }
    }
    students[numberOfStudents] = new Student(name);
    numberOfStudents++;
    return true;
  }

  public boolean increaseNumberOfTasks(String name, int by) {
    for (Student student : students) {
      if (student.getName().equals(name)) {
        student.increaseNumberOfTasks(by);
        return true;
      }
    }
    return false; // ikke funnet
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numberOfStudents; i++) {
      sb.append(students[i].toString()).append("\n");
    }
    return sb.toString(); 
  }
}