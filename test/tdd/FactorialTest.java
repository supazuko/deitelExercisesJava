package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("check for invalid input")
    @Test
    void test1(){
        int input = 3;
        factorial.setInput(input);
        assertEquals(3, factorial.getInput());
    }

    @DisplayName("check for invalid input")
    @Test
    void test2(){
        int input = -1;
        factorial.setInput(input);
        assertEquals(0, factorial.getInput());
    }

    @DisplayName("Calculate factorial")
    @Test
    void test3(){
        int input = 3;
        factorial.calculateFactorial(input);
        assertEquals(6, factorial.getFactorial());
    }

    @DisplayName("Calculate exponent")
    @Test
    void test4(){
        int input = 3;
        factorial.calculateExponent(input);
        assertEquals(2.6666666666666665, factorial.getExponent());
    }

    @DisplayName("Calculate exponent raised to power x")
    @Test
    void test5(){
        int input = 2;
        factorial.calculateExponentRaisedToPowerX(input);
        assertEquals(5.0, factorial.getExponentRaisedToPowerX());
    }

}