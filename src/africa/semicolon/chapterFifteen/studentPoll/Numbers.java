package africa.semicolon.chapterFifteen.studentPoll;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Numbers {
    private static Formatter numbers;

    public static void openFile() {
        try {
            numbers = new Formatter("numbers.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void closeFile() {
        if (numbers != null) numbers.close();
    }

    public static void addResponses() {
        Scanner input = new Scanner(System.in);
        System.out.println("Rate on a scale of 1 to 5 the quality of lunch in Semicolon, with 1 being “awful” and 5 being “excellent.”");
        while (input.hasNextInt()){
            try{
                System.out.println("Rate on a scale of 1 to 5 the quality of lunch in Semicolon, with 1 being “awful” and 5 being “excellent.”");
                numbers.format("%d", input.nextInt());
            }catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.hasNextInt();
            }
        }
    }

    public static void main(String[] args) {
        openFile();
        addResponses();
        closeFile();
    }
}
