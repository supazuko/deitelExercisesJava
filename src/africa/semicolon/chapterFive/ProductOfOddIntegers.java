package africa.semicolon.chapterFive;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 1){
                product = product*i;
            }
        }
        System.out.println(product);
    }
}
