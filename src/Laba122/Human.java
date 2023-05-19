package Laba122;

public class Human {
    protected String firstName;
    protected String lastName;

    protected Human(String firstName, String lastName) throws Exception {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    protected void setFirstName(String firstName) throws Exception {
        if (firstName.length() < 4)
            throw new Exception("Expected length at least 4 symbols! Argument: firstName");
        else if (!Character.isUpperCase(firstName.charAt(0)))
            throw new Exception("Expected upper case letter! Argument: firstName");
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) throws Exception {
        if (firstName.length() < 3)
            throw new Exception("Expected length at least 3 symbols! Argument: lastName");
        else if (!Character.isUpperCase(firstName.charAt(0)))
            throw new Exception("Expected upper case letter! Argument: lastName");
        this.lastName = lastName;
    }
}
