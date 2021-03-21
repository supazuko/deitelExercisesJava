package africa.semicolon.chapterFive;

public class CalculatePiValue {
    public static void main(String[] args) {
        int limit = 200000;
        int denominator = 1;
        double piValue = 0;
        int firstTermOfPiValue = 0;
        boolean isPiValue = false;

        for (int i = 1; i <= limit ; i++) {
            if(i % 2 == 1)
                piValue += 4.0 / denominator;
            else
                piValue -= 4.0 / denominator;

            if((int) (piValue * 100000) == 314159 && !isPiValue){
                firstTermOfPiValue = i;
                isPiValue = true;
            }
            System.out.println(i + "\t\t" + piValue);
            denominator+=2;
        }
        System.out.println();
        System.out.println("Number of terms used before hitting Pi value of 3.14159 = " + firstTermOfPiValue);
    }
}
