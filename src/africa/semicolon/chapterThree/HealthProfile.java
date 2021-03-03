package africa.semicolon.chapterFour;

public class HealthProfile {
        private String firstName;
        private String lastName;
        private String gender;
        private double height;
        private double weight;
        private int day;
        private int month;
        private int year;
        private int age;
        private int maximumHeartRate;

        public HealthProfile(String firstName, String lastName, String gender, double height, double weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.height = height;
            this.weight = weight;
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

        public void setGender(String gender){
            this.gender = gender;
        }
        public String getGender(){
            return gender;
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
        public void setHeight(double height){
            if(height > 0)
                this.height = height;
        }
        public double getHeight(){
            return height;
        }
        public void setWeight(double weight){
            if(weight > 0)
                this.weight = weight;
        }
        public double getWeight(){
            return weight;
        }
        public int getYear() {
            return year;
        }
        public int calculateAge(int patientYearOfBirth){
            age = 2021 - year;
            return age;
        }
        public int calculateMaximumHeartRate(int year){
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
        public double calculateBMI(){
            double BMI = (weight * 703)/(height * height);
            return BMI;
        }

}
