import java.util.Scanner;
public class QuadraticCalculator{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//x1 = (-b + sqrt((b*b)-(4*a*c))/2*a
		//x2 = (-b - sqrt((b*b)-(4*a*c))/2*a

		double a;
		double b;
		double c;
		double x1;
		double x2;
	
		System.out.print("Enter the value of a: ");
			a = input.nextDouble();
		System.out.print("Enter the value of b: ");
			b = input.nextDouble();
		System.out.print("Enter the value of c: ");
			c = input.nextDouble();
		
		double squareRoot;
		squareRoot = Math.sqrt((b*b) - (4*a*c));
		x1 = (-b+squareRoot) / (2*a);
		x2 = (-b-squareRoot) / (2*a);

		System.out.printf("Solution: %nx1 is %.2f%nx2 is %.2f%n", x1, x2);
	}
}