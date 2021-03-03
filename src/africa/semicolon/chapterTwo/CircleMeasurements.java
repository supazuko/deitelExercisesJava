import java.util.Scanner;
public class CircleMeasurements{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("Enter value of radius");
        	int r = input.nextInt();

       	double pi = Math.PI;
        float diameter = 2*r;
        float circumference = (float)(2*pi*r);
        float area = (float)(pi*r*r);
        
        System.out.printf("Diameter %.2f%n", diameter);
        System.out.printf("Circumference %.2f%n", circumference);
        System.out.printf("Area %.2f%n", area);
    }
}