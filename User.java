//Scenario: Trainee lodges a registration fee refund request which is addressed by the finance manager
//and Scenario: A manager creates a poll that is responded to by a trainee

import java.util.Date;

public class User {
    
    //declare variables for User class
    private int userID;
    private String username;
    private String password;
    private String email;
    private Date dateOfBirth;
    private String userType; 
    private String fullName; 
    private String address; 
    private String bankAccount;
    private int contactNumber;
    private int emergancyContact;

    //User constructor
    public User(int uID, String u, String p, String e, Date d, String uT, String fN, String a, String bA, int cN, int eC) {}

    //getter methods
    public int getUserID() {return 0;}

    public String getUsername() {return "";}

    public String getPassword() {return "";}

    public String getEmail() {return "";}

    //(unsure of what the default return type of date should be)
    //public Date getDateOfBirth() {return "";}

    public String getUserType() {return "";}

    public String getFullName() {return "";}

    public String getAddress() {return "";}

    public String getBankAccount() {return "";}
    
    public int getContactNumber() {return 0;}
    
    public int getEmergencyContact() {return 0;}

    //other methods
    

}
