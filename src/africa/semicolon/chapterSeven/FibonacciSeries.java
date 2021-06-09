package africa.semicolon.chapterSeven;

import java.util.Scanner;

public class FibonacciSeries {

    public static int checkFibonacci(int n){
        if (n <= 1) return 1;
        return checkFibonacci( n- 1)
                + checkFibonacci(n - 2);
    }
    public static int checkFibonacci(double n){
        if (n <= 1) return 1;
        return checkFibonacci( n- 1)
                + checkFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(checkFibonacci(i) + " ");
        }
    }
}
