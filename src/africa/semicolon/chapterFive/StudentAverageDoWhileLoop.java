package africa.semicolon.chapterFour;

import java.util.Scanner;

public class StudentAverageDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalScore = 0;
        int score;
        int i = 1;
        int average = 0;

        do {
            System.out.print("Enter student score: ");
            score = input.nextInt();
            totalScore += score;
            average = totalScore / i;
            i++;
        }
        while (i <= 10);
        System.out.print(average);
    }
}
//    int smallest = Math.min(number);
//        System.out.println("Smallest = " + smallest);
//                int largest = Math.max(number);
//                System.out.println("Largest = " + largest);