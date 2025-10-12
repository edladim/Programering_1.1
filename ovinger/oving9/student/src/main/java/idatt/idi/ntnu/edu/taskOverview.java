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
    for (int i = 0; i < numberOfStudents; i++) {
      if (students[i].getName().equals(name)) {
        return students[i].getNumberOfTasks();
      }
    }
    return -1; // ikke funnet
  }

  public void registerNewStudent(Student newStudent) {
    this.students[numberOfStudents] = newStudent;
    this.numberOfStudents++;
  }


}