package africa.semicolon.chapterSeven;

import java.util.Arrays;

public class SieveOfErastosthenes {
//    boolean[] values = new boolean[1000];

    public void checkForPrimeNumbers(boolean[] values) {
        Arrays.fill(values, true);

        for (int j = 2; j < values.length; j++) {
            if (values[j]) {
                for (int k = j * 2; k < values.length; k += j)
                    values[k] = false;
            }

//        for (int i = 2; i < values.length; i++) {
//            int counter = 0;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if(i % j == 0)
//                    counter++;
//            }
//            values[i] = counter == 0;
//        }

//        for (int i = 2; i < values.length; i++) {
//            if(values[i]){
//                int multiple;
//                for (int j = 2; j < values.length; j++) {
//                    multiple = i*j;
//                    if(multiple < values.length-1){
//                        values[multiple] = false;
//                    }
//                    else
//                        break;
//                }
//            }
//        }

        }
    }

}




