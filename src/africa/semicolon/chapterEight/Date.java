package africa.semicolon.chapterEight;

public class Date {
    private int day;
    private int month;
    private int year;
    private int daysInAYear;

    private final String[] months =
            {"January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
            };
    private final int[] DAYS_IN_MONTHS =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) {
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Month is out of range");
        }
        if(day < 1 || day > 31){
            throw new IllegalArgumentException("Day is out of range");
        }
        this.day = day;
        this.year = year;
        this.month = month;
        this.daysInAYear = calculateDaysInAYear(month, day);
    }
    public Date(int day, String month, int year) {
        this.day = day;
        this.year = year;
        int result = getMonthIndex(month);
        if(result < 0){
            throw new IllegalArgumentException("Month is invalid");
        }
        this.month = result;
        this.daysInAYear = calculateDaysInAYear(this.month, this.day);
    }
    public Date(int days, int year) {
        this.year = year;
        if(days <= 31 && days > 0){
            this.day = days;
            this.month = 1;
        }else {
            calculateMonthAndDay(days);
        }
        this.daysInAYear = days;
    }

    private int getMonthIndex(String month){
        for (int i = 0; i < month.length(); i++) {
            if(month.equals(months[i])){
                return i + 1;
            }
        }
        return -1;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDaysInAYear() {
        return daysInAYear;
    }

    public void calculateMonthAndDay(int daysInAYear){
        for (int i = 0; i < DAYS_IN_MONTHS.length; i++) {
            daysInAYear -= DAYS_IN_MONTHS[i];
            if(daysInAYear <= 31 && daysInAYear > 0){
                setDay(daysInAYear);
                setMonth(i + 2);
            }
        }
    }

    public int calculateDaysInAYear(int month, int day){
        int sum = day;
        for (int i = 0; i < month - 1; i++) {
            sum += DAYS_IN_MONTHS[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format(
                "%02d/%02d/%d%n%s %02d, %d%n%03d %d",
                month, day, year,
                this.months[month-1], day, year);
    }


    public static void main(String[] args) {
        Date date1 = new Date(10, 14, 2002);
        Date date2 = new Date(3, "March", 2002);
        Date date3 = new Date(182, 2000);

        System.out.printf("Date object with 3 args --> %s", date1);
        System.out.printf("Date object with int(Day), String(Month), int(Year)", date2);
        System.out.printf("Date object with int(day), int(year)", date3);
    }

}


