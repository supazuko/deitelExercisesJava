package africa.semicolon.chapterSeven;

public class DuplicateElimination {
    private final int[] array = new int[5];

    public String displayUniqueInput(){
        String elementOfArrayValues = "";
        for (int number: array) {
            elementOfArrayValues += number + ",";
        }
        return elementOfArrayValues;
    }
    public void collectInput(int input) {
        boolean inputIsInvalid = input < 10 || input > 100;
        for (int i = 0; i < array.length; i++) {
            if (inputIsInvalid)
                throw new IllegalArgumentException("Number must be between range of 10-100");
            else if (input == array[i])
                throw new IllegalArgumentException("Number already exists in the array");
            else if (array[i] == 0){
                array[i] = input;
                break;
            }
        }
    }
}
