package tdd;

import java.util.ArrayList;

public class Kahoot {
    ArrayList <Question> questions = new ArrayList<>();

    public void createQuestion() {
        Question question = new Question();
        questions.add(question);
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public void deleteQuestion(int questionID) {
        for (Question question : questions){
            if (question.getQuestionID() == questionID){
                questions.remove(question);
                break;
            }
        }
    }
}
