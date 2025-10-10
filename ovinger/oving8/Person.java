/**
 * Represents a person with first name last name and, year of birth.
 */
public final class Person {
  private final String firstName;
  private final String lastName;
  private final int yearOfBirth;

  /**
   * Constructs a new person with the specifyed first name, last name and year of birth.
   *
   * @param firstName the first name of the person
   * @param lastName the last name of the person
   * @param yearOfBirth the year of birth og the person
   */
  public Person(String firstName, String lastName, int yearOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;    
  }

  /**
   * Returnes the first name of the person.
   *
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns the last name of the person.
   *
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns the persons year of birth.
   *
   * @return the year of bith
   */
  public int getYearOfBirth() {
    return yearOfBirth;
  }
}
