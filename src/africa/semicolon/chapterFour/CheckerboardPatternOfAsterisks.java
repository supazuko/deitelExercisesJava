package africa.semicolon.chapterFour;

public class CheckerboardPatternOfAsterisks {
    public void buildCheckerBoardWithAsterisks(int size) {
        int asteriskLimit = 0;
        String row = "";
        String column ="";
        while(asteriskLimit < size){
            row += "* ";
            column += " *";
            asteriskLimit++;
        }
        System.out.println(row);
        System.out.println(column);

        for (asteriskLimit = 0; asteriskLimit < ((size / 2) - 1); asteriskLimit++){
            System.out.println(row);
            System.out.println(column);
        }
    }
}
