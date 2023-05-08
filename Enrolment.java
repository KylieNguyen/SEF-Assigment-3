//Scenario: Trainee lodges a registration fee refund request which is addressed by the finance manager

import java.util.Date;

public class Enrolment {
    
    //declare variables for enrolment class
    private String selectedCourse;
    private String fullName;
    private Date dateOfBirth;
    private String address;
    private int contactNumber;
    private int emergencyContact;
    private String email;
    
    //constructor
    public Enrolment(String selectedCourse, String fullName, Date dateOfBirth, String address, int contactNumber, int emergencyContact, String email) {}

    //getter methods
    public String getSelectedCourse() {return "";}

    public String getFullName() {return "";}

    //(unsure of what the default return type of date should be)
    //public Date getDateOfBirth() {return "";}

    public String getAddress() {return "";}

    public int getContactNumber() {return 0;}
    
    public int getEmergencyContact() {return 0;}

    public String getEmail() {return "";}

}
