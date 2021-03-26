package tdd;

public class Question {
    public static int globalQuestionID;
    private int questionID;

    public Question(){
        questionID = globalQuestionID++;
    }

    public int getQuestionID(){
        return questionID;
    }
}
