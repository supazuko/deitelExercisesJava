package africa.semicolon.chapterFive;

public class FacebookUserBaseGrowth {
    public static void main(String[] args) {
        int totalUsers = 1000000000;
        double growthRate = 0.04;
        int months = 1;
        double newUsers;

        while (true) {
            newUsers = totalUsers * Math.pow((1.0 + growthRate), months);
            if (newUsers >= 1500000000)
                break;
            months++;
        }
        System.out.println("Facebook grew its user base to 1.5 billion users after " + months + " months");

        System.out.println();

        while (true) {
            newUsers = totalUsers * Math.pow((1.0 + growthRate), months);
            if (newUsers >= 2000000000)
                break;
            months++;
        }
        System.out.println("Facebook grew its user base to 2 billion users after " + months + " months");
    }
}
