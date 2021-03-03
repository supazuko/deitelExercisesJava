public class OddOrEvenNumbers{
	public static void main(String[] args) {

	int min = 1;
	
	System.out.println("Odd\t\tEven");
	while (min <= 100) {	
		if (min %2 == 0){
		System.out.printf(" \t\t%d%n", min);
		}
		else {
		System.out.printf("%d", min);
		}
		min++;
	}

}
}