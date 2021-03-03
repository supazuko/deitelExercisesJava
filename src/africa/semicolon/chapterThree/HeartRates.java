package africa.semicolon.chapterFour;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private int age;
    private int maximumHeartRate;

    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public int calculateAge(){
        age = 2021 - year;
        return age;
    }
    public int calculateMaximumHeartRate(){
        maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }
    public String getTargetHeartRate(){
        double minimumTargetHeartRate = 0.5 * (maximumHeartRate * 1.0);
        double maximumTargetHeartRate = 0.85 * (maximumHeartRate * 1.0);
        String targetHeartRate = minimumTargetHeartRate + " - " +  maximumTargetHeartRate;
        return targetHeartRate;
    }
    public void setDOB(int month, int day, int year){
        if(month >= 1 && month <=12 && day >= 1 && day <= 31 && year >= 1900 && year <= 2021)
        {this.year = year;
            this.month = month;
            this.day = day;}
    }
    public String getDOB(){
        String DOB = day + "/" + month + "/" + year;
        return  DOB;
    }
}

