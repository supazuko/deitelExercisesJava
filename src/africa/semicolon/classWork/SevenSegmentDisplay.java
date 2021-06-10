package africa.semicolon.classWork;

import java.util.Arrays;

public class SevenSegmentDisplay {
    private int[][] array = new int[5][4];

    public void display(){
        for (int[] row : array) {
            for (int column : row) {
//                System.out.print(column + " ");
                if(column == 1) System.out.print("# ");
                if(column == 0) System.out.print("  ");
            }
            System.out.println();
        }
    }
    public void writeOnA(){
        for (int i = 0; i < 4; i++) {
            array[0][i] = 1;
        }
    }
    public void writeOnB(){
        for (int i = 0; i < 3; i++) {
            array[i][3] = 1;
        }
    }
    public void writeOnC(){
        for (int i = 2; i < 5; i++) {
            array[i][3] = 1;
        }
    }
    public void writeOnD(){
        for (int i = 0; i < 4; i++) {
            array[4][i] = 1;
        }
    }
    public void writeOnE(){
        for (int i = 2; i < 5; i++) {
            array[i][0] = 1;
        }
    }
    public void writeOnF(){
        for (int i = 0; i < 3; i++) {
            array[i][0] = 1;
        }
    }
    public void writeOnG(){
        for (int i = 0; i < 4; i++) {
            array[2][i] = 1;
        }
    }
    private void checkPowerBit(String input){
        if(input.charAt(7) == '0'){
            return; }
    }
    private String checkLength(String input){
        if(input.length() > 8){
            input = input.substring(0, 8);
        }return input;
    }
    private void checkValueIsValid(String input){
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if (!(c == '1' || c == '0')) {
                throw new IllegalArgumentException("Invalid input, input should only be 1 and 0");
            }
        }
    }
    private String makeBitComplete(String input){
        if(input.length() < 8){
            StringBuilder stringBuilder = new StringBuilder(input);
            while(stringBuilder.length() <= 8){
                stringBuilder.insert(0, '0');
            }
            input = stringBuilder.toString();
        }
        return input;
    }
    private int convertToBinary(int decimal){
        int input = 0;
        int multiplier = 1;
        while(decimal > 0){
            input += multiplier * (decimal%2);
            decimal/=2;
            multiplier *=10;
        }
        return input;
    }
    public void setValue(String input){

        if(input.length() < 8){
            StringBuilder stringBuilder = new StringBuilder(input);
            while(stringBuilder.length() <= 8){
                stringBuilder.insert(0, '0');
            }
            input = stringBuilder.toString();
        }
        if(input.length() > 8){
            input = input.substring(0, 8);}
        if(input.charAt(7) == '0'){ return; }
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if (!(c == '1' || c == '0')) {
                throw new IllegalArgumentException("Invalid input, input should only be 1 and 0");
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1'){
                switch (i){
                    case(0) -> writeOnA();
                    case(1) -> writeOnB();
                    case(2) -> writeOnC();
                    case(3) -> writeOnD();
                    case(4) -> writeOnE();
                    case(5) -> writeOnF();
                    case(6) -> writeOnG();
                }
            }
        }
    }
}
