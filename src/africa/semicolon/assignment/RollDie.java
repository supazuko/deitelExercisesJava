package africa.semicolon.assignment;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = new int[6];

        for (int roll = 1; roll < 1000; roll++){
            int face = 1 + random.nextInt(6);
            array[face-1]++;
        }
        System.out.printf("%3s%10s%n", "Face", "Count");
        for (int i = 0; i < array.length; i++){
            System.out.printf("%3d%10d%n", i+1, array[i]);
        }
    }
}
