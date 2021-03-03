/*Collect score from user
check 
	if score is >= 90, print A
	else if score is >= 80 and <= 89, print B
	else if score is >= 70 and <= 79, print C
	else if score is < 70 , print F*/

import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	double score;
	System.out.print("Enter score: ");
        	score = input.nextDouble();

	if (score >= 0 && score <= 100) {
		if (score >= 90)
			System.out.println("A");
	   		else
				if (score >= 80 && score <= 89.9)
					System.out.println("B");
	    			else
					if (score >= 70 && score <= 79.9)
						System.out.println("C");
	    				else
						if (score < 70)
							System.out.println("F");
		}

		else
			System.out.println("Invalid Score");
}
}