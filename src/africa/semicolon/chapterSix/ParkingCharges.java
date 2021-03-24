package africa.semicolon.chapterSix;

public class ParkingCharges {
    private static double charges;
    public static double calculateCharges(double totalHours){
        if (totalHours > 0){
            charges = 2.00;
            if (totalHours > 3){
                for (int i = 0; i < (totalHours - 3); i++) {
                    charges = charges + 0.50;
                    if (charges == 10.00){
                        break;
                    }
                }
            }
        }return charges;
    }
}
