package africa.semicolon.chapterSeven;

public class SieveOfErastosthenesMain {
    public static void main(String[] args) {
        int numbers = 100;
        boolean[] primeNumbers = new boolean[numbers];
        SieveOfErastosthenes sieve = new SieveOfErastosthenes();
        sieve.checkForPrimeNumbers(primeNumbers);
        for (int i = 0; i < primeNumbers.length; i++) {
            if(primeNumbers[i])
            System.out.println("Prime numbers are: " + i);
        }
    }
}
