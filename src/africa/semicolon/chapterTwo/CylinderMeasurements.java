import java.util.Scanner;
public class CylinderMeasurements{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("Enter radius of a cylinder");
        	int radius = input.nextInt();
	System.out.println("Enter length of a cylinder");
        	int length = input.nextInt();

       	double pi = Math.PI;
        float area = (float)(radius*radius*pi);
	float volume = (float)(area*length);
        
        System.out.printf("Area is %.2f%n", area);
	System.out.printf("Volume is %.2f%n", volume);
    }
}