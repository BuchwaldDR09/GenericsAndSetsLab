package listlab3;

import java.util.*;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    
}
