package africa.semicolon.chapterFour;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        long currentWorldPopulation = 7800000000L;
        double growthRate = 1.05;
        boolean isDouble = true;
        int yearAtDouble = 0;
        long annualPopulationDifference;
        long anticipatedWorldPopulation = currentWorldPopulation + (((long)growthRate * currentWorldPopulation)/100);

        System.out.printf("%5s%35s%35s%n", "Year", "Anticipated World Population", "Potential Population Increase");

        for (int year = 1; year <= 75; year++) {
            long worldPopulation = 7800000000L;
            currentWorldPopulation = anticipatedWorldPopulation;
            anticipatedWorldPopulation = currentWorldPopulation + (((long)growthRate * currentWorldPopulation)/100);
            annualPopulationDifference =  anticipatedWorldPopulation - currentWorldPopulation;
            System.out.printf("%3s%25s%30s%n", year, anticipatedWorldPopulation, annualPopulationDifference);
            if (anticipatedWorldPopulation >= (2*worldPopulation) && isDouble){
                yearAtDouble = year;
            }
        }
        System.out.println("The year will be double the current population at year: " + yearAtDouble);
    }
}
