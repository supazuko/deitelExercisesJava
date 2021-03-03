package africa.semicolon.chapterFour;
import java.util.Scanner;
public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalScore = 0;
        int score;
        int i;
        int average = 0;

        for (i = 1; i <= 10; i++) {
            System.out.print("Enter student score: ");
            score = input.nextInt();
            totalScore += score;
            average = totalScore / i;
        }
        //System.out.print(totalScores);
        System.out.print(average);
    }
}
