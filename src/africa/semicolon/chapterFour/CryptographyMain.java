package africa.semicolon.chapterFour;

import java.util.Scanner;

public class CryptographyMain {
    public static void main(String[] args) {
        Cryptography decrypt = new Cryptography();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a four digit number: ");
            int number = input.nextInt();

            String encryptedNumber = decrypt.encrypt(number);
            System.out.println(encryptedNumber);
            System.out.println();
        }

    }

}
