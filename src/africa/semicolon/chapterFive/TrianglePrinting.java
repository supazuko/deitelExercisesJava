package africa.semicolon.chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();

        for (int i = 0; i < 10 ; i++) {
            for (int j = 9; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
        System.out.println();

        int blankSpaces = 0;
        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < blankSpaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
            blankSpaces++;
        }

        int blank = 10;
        for (int i = 0; i <= blank; i++) {
            for (int j = 0; j < blankSpaces; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            blankSpaces--;
        }
    }
}
