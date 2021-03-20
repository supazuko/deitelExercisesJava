package africa.semicolon.chapterFive;

public class FactorialOfTwenty {
    public static void main(String[] args) {
        long factorial = 1L;
        System.out.println("Numbers" + "\t\t" + "Factorials");
        for (int i = 1; i <= 20; i++) {
            factorial = factorial*i;
            System.out.println(i + "\t\t\t" + factorial);
        }
    }
}
