package Assignment_2.Assignment_2_2;


public class Task9 {
private String firstName;
    private String lastName;

    public static void Person(String firstName, String lastName) {
       // this.firstName = firstName;
        //this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
