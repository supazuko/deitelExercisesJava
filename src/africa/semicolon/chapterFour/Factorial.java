package africa.semicolon.chapterFour;

public class Factorial {
    private int input;
    private int counter;
    private int factorial = 1;
    private int mathConstantE = 1;
    private int mathConstantEToPowerX = 1;

    public void collectInput(int input) {
        if(input >= 0) {
            this.input = input;
        }
    }
    public int getInput() {
        return input;
    }
    public void calculateFactorial(int input) {
        while (input > 0){
            factorial *= input;
            input--;
        }
    }
    public int getFactorial() {
        return factorial;
    }
//    public void calculateMathematicalConstantE(int input) {
//        counter = 1;
//        while (counter <= input){
//            mathConstantE += 1/factorial;
//            counter++;
//        }
//    }
//    public int getMathConstantE() {
//        return mathConstantE;
//    }
    public void calculateMathematicalConstantEToPowerX(int input) {
        int counter = 1;
        while (counter <= input){
            mathConstantEToPowerX += Math.pow(counter, input)/ factorial;
            counter++;
        }
    }
    public int getMathConstantEToPowerX() {
        return mathConstantEToPowerX;
    }
}
