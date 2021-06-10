package africa.semicolon.classWork;

public class SevenSegmentDisplayMain{
    public static void main(String[] args) throws InterruptedException{
        SevenSegmentDisplay sevenSegment = new SevenSegmentDisplay();
        String input = "11111111";

        sevenSegment.setValue(input);
        sevenSegment.display();
    }
}
