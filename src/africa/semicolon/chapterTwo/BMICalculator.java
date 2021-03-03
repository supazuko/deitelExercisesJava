import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	double weight;
	double height;
	double bmi;
	System.out.print("Enter your weight in Kilograms: ");
		weight = input.nextDouble();
	System.out.print("Enter your height in meters: ");
		height = input.nextDouble();

	bmi = weight/(height*height);

	System.out.println("");
	System.out.println("Your BMI is " + bmi);
	System.out.println("");
	System.out.println("BMI VALUES");
	System.out.println("Underweight: \tless than 18.5");
	System.out.println("Normal: \tbetween 18.5 and 24.9");
	System.out.println("Overweight: \tbetween 25 and 29.9");
	System.out.println("Obese: \t\t30 or greater");


}
}