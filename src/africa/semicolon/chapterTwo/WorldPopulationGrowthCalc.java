public class WorldPopulationGrowthCalc{
	public static void main(String[] args){

	long worldPopulation = 7800000000l;

	double growthRate = 1.05;

	long firstYear = worldPopulation + (((long)growthRate * worldPopulation)/100);	
	long secondYear = firstYear + (((long)growthRate * firstYear)/100);
	long thirdYear = secondYear + (((long)growthRate * secondYear)/100);
	long fourthYear = thirdYear + (((long)growthRate * thirdYear)/100);
	long fifthYear = fourthYear + (((long)growthRate * fourthYear)/100);
	
	System.out.println("Estimated population for Year 1 is " + firstYear);
	System.out.println("Estimated population for Year 2 is " + secondYear);
	System.out.println("Estimated population for Year 3 is " + thirdYear);
	System.out.println("Estimated population for Year 4 is " + fourthYear);
	System.out.println("Estimated population for Year 5 is " + fifthYear);
	}
}