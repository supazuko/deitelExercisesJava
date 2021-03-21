package africa.semicolon.chapterFive;

public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double interestRate;
        for (interestRate = 5; interestRate <=10; interestRate++) {
            System.out.printf("%s%28s%n", "Year", "Amount on deposit("+interestRate+"%)");

            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow((1.0 + interestRate/100), year);
                System.out.printf("%2d%,20.2f%n", year, amount);
            }
            System.out.println();
        }

    }
}
