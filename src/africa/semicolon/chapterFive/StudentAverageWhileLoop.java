package africa.semicolon.chapterFour;

import java.util.Scanner;

public class StudentAverageWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalScore = 0;
        int score;
        int i = 1;
        int average = 0;

        while (i <= 10) {
            System.out.print("Enter student score: ");
            score = input.nextInt();
            totalScore += score;
            average = totalScore / i;
            i++;
        }
        System.out.print(average);
    }
}
