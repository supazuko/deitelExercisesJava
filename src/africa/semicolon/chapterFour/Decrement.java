package africa.semicolon.chapterFour;

public class Decrement {
    public static void main(String[] args) {
        int i = 1;
//        int firstDigit = i/10000;
//        int secondDigit = i % 10000/1000;
//        int fourthDigit = i % 10000 % 1000 % 100 / 10;
//        int fifthDigit = i % 10;
//        System.out.println(fourthDigit);
        for (i = 1000; i >= 10; i--){
            int cube = i*i*i;
            System.out.println(cube);
        }
    }
}
