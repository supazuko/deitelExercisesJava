import java.util.Scanner;
public class BitFlipper{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	int digit;
	System.out.print("Enter either 1 or 0: ");
		digit = input.nextInt();

		System.out.println(digit == 0 ? "Print 1" : "Print 0");
}
}