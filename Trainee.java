//Scenario: Trainee lodges a registration fee refund request which is addressed by the finance manager
//and Scenario: A manager creates a poll that is responded to by a trainee
import java.util.Date;
import java.util.List;

public class Trainee extends User {

    public List<String> registeredCourses; 
    //CD had -+ ?
    public List<String> payments; 

    public Trainee (int uID, String u, String p, String e, Date d, String uT, String fN, String a, String bA, int cN, int eC, List<String> rC, List<String> payments) {};

}