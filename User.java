//Scenario: Trainee lodges a registration fee refund request which is addressed by the finance manager
//and Scenario: A manager creates a poll that is responded to by a trainee

import java.util.Date;

public abstract class User {
    
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
    private int emergencyContact;

    //User constructor
    public User(int userID, String username, String password, String email, Date dateOfBirth, String userType, String fullName, String address, String bankAccount, int contactNumber, int emergencyContact) {}

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
