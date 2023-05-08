//Scenario: Trainee lodges a registration fee refund request which is addressed by the finance manager

import java.util.Date;

public class TrainingCourse {
    
    private String courseID;
    private String title;
    private String trainingType;
    private Date learningPeriod;
    private String trainer;
    private String category;
    private Double courseFee;
    private int seatsAvailable;
    private int duration;
    private Date startDate;
    private Date endDate;

    public TrainingCourse(String courseID, String title, String trainingType, Date learningPeriod, String trainer, String category, Double courseFee, int seatsAvailable, int duration, Date startDate, Date endDate) {}

    public String getCourseID() {return "";}

    public String getTitle() {return "";}

    public String getTrainingType() {return "";}

    //(unsure of what the default return type of date should be)
    //public Date getLearningPeriod() {return "";}

    public String getTrainer() {return "";}

    public String getCategory() {return "";}

    public Double getCourseFee() {return 0.0;}
    
    public int getSeatsAvailable() {return 0;}
    
    public int getDuration() {return 0;}

    //(unsure of what the default return type of date should be)
    //public Date getStartDate() {return "";}

    //(unsure of what the default return type of date should be)
    //public Date getEndDate() {return "";}

    //other methods
}

