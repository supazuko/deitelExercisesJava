package africa.semicolon.chapterFifteen.studentPoll;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Output {
    private static Scanner input;
    private static Formatter output;

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("numbers.txt"));
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void closeFile() {
        if (input != null) input.close();
        output.close();
    }

    public static int[] readResponses() {
        int[] frequency = new int[6];
        try {
            while (input.hasNextInt()) {
                int answer = input.nextInt();
                try{
                    ++frequency[answer];
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                }
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
        return frequency;
    }

    public static void printResponses(int[] frequency)  {
        try{
            output = new Formatter("output.txt");
            output.format("%s%10s%n", "Rating", "Frequency");
            System.out.printf("%s%10s%n", "Rating", "Frequency");

            for (int i = 1; i < frequency.length; i++) {
                output.format("%d%10d%n", i, frequency[i]);
                System.out.printf("%d%10d%n", i, frequency[i]); }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        openFile();
        int[] frequency = readResponses();;
        printResponses(frequency);
        closeFile();
    }
}
