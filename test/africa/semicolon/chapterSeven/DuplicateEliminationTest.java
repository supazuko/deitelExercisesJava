package africa.semicolon.chapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    private DuplicateElimination duplicate;

    @BeforeEach
    void setUp() {
        duplicate = new DuplicateElimination();
    }

    @Test
    void testThatInputAreUnique(){
        duplicate.collectInput(20);
        duplicate.collectInput(12);
        duplicate.collectInput(10);
        assertEquals("20,12,10,0,0,", duplicate.displayUniqueInput());
    }
}