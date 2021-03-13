package tdd;
public class Factorial {

    private int input;
    private int product;
    private double exponent;
    private double exponentRaisedToPowerX;

    public void setInput(int input) {
        if(input > 0){
            this.input = input;
        }else
            System.out.println("invalid input");

    }

    public int getInput() {
        return input;
    }

    public void calculateFactorial(int input) {
        setInput(input);
        product = 1;
        input = getInput();
        while(!(input < 1)){
            product *= input;
            input--;
        }
    }

    public int getFactorial() {
        return product;
    }

    public void calculateExponent(int input) {
        setInput(input);
        exponent = 1;
        int counter = 1;
        while(counter <= input){
            calculateFactorial(counter);
            exponent = exponent + (1.0 / getFactorial());
            counter++;
        }
    }

    public double getExponent() {
        return exponent;
    }

    public void calculateExponentRaisedToPowerX(int input) {
        setInput(input);
        exponentRaisedToPowerX = 1;
        int counter;
        for (counter = 1; counter <= input; counter++){
            calculateFactorial(counter);
            exponentRaisedToPowerX = exponentRaisedToPowerX + (Math.pow(input, counter)/getFactorial());
        }
    }

    public double getExponentRaisedToPowerX() {
        return exponentRaisedToPowerX;
    }
}
