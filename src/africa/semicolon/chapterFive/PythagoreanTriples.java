package africa.semicolon.chapterFive;

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.println("side1\t side2\t hypotenuse");
        for (int i = 1; i <= 500; i++){
            for (int j = 1; j <= 500; j++) {
                for (int k = 1; k <= 500; k++) {
                    boolean isPythagoras = ((i*i) + (j*j) == (k*k));
                    if (isPythagoras) {
                        System.out.println(i + "\t\t" + j + "\t\t\t" + k);
                    }
                }
            }
        }
    }
}
