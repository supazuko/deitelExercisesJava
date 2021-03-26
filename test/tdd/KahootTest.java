package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KahootTest {
    private Kahoot kahoot;
    @BeforeEach
    void startEachTestWith(){
        kahoot = new Kahoot();
    }
    @AfterEach
    void afterEach(){
        kahoot = null;
    }

    @Test
    void kahootCanCreateQuestions(){
        kahoot.createQuestion();
        assertEquals(1, kahoot.getTotalQuestions());
        kahoot.createQuestion();
        assertEquals(2, kahoot.getTotalQuestions());
    }
    @Test
    void kahootCanDeleteQuestion(){
        kahoot.createQuestion();
        kahoot.createQuestion();
        assertEquals(2, kahoot.getTotalQuestions());
        kahoot.deleteQuestion(0);
        assertEquals(1, kahoot.getTotalQuestions());
    }
    @Test
    void kahootCannotDeleteNonExistentQuestion(){
        kahoot.createQuestion();
        kahoot.deleteQuestion(5);
        assertEquals(1, kahoot.getTotalQuestions());
    }
}
