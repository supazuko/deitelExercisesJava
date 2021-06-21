package africa.semicolon.chapterFifteen.studentPoll;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Output {
    private static Scanner input;

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
    }

    public static void readResponses() {
        System.out.printf("%s%10s%n", "Rating", "Frequency");
        try {
            while (input.hasNextInt()) {
                System.out.printf("%s%10s%n", input.nextInt(), input.nextInt());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    public static void main(String[] args) {
        openFile();
        readResponses();
        closeFile();
    }
}
