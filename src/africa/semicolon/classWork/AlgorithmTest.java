import java.util.Scanner;
public class AlgorithmTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	double score;
	System.out.print("Enter score: ");
        	score = input.nextDouble();
	if (score >=40 && score == 100){
		System.out.println("Passed!");
	    }
	if (score < 40 && score == 0){
		System.out.println("Failed!");
	    }
	else
		System.out.println("Invalid Number");
}
}