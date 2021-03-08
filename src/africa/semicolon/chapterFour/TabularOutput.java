package africa.semicolon.chapterFour;

public class TabularOutput {
        public static void main(String[] args) {
            int number = 1;
            int numberTimesTen;
            int numberTimesOneHundred;
            int numberTimesOneThousand;

            System.out.println("N\t" + "10*N\t" + "100*N\t" + "1000*N" );
            System.out.println();
            while(number <= 5){
                numberTimesTen = number * 10;
                numberTimesOneHundred = numberTimesTen * 10;
                numberTimesOneThousand = numberTimesOneHundred * 10;
                System.out.println(number + "\t" + numberTimesTen + "\t\t" + numberTimesOneHundred + "\t\t" + numberTimesOneThousand);
                number++;
            }
        }
}
