package africa.semicolon.chapterFour;

public class MultiplesOfTwoInfiniteLoop {
    public static void main(String[] args) {
        int counter;
        for(counter = 2; counter % 2 == 0; counter*=2){
            System.out.println(counter);
        }
    }
}
