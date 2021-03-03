package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void startAllTestsWith(){
        calculator = new Calculator();
    }

   @Test
    void addTwoNumbersTest() {
       int sum = calculator.add(3,2);
       assertEquals(7, calculator.add(5,2));
    }
    @Test
    @DisplayName("Testing for multiplication")
    void multiplyTwoNumbers(){
       int multiply = calculator.multiply(3,2);
        assertEquals(10, calculator.multiply(5,2));
        assertEquals(9, calculator.multiply(3,3));
    }
    @Test
    @DisplayName("Two numbers can be divided")
    void divideTwoNumbersTest(){
        assertEquals(2, calculator.divide(6,3));
        assertEquals(3, calculator.divide(15,5));
    }
    @Test
    @DisplayName("Testing for float return")
    void divideTwoNumbersToYieldFloatTest(){
        assertEquals(2.5, calculator.divide(5,2));
    }
    @Test
    @DisplayName("Division by zero returns zero")
    void divisionByZeroTest(){
        assertEquals(0, calculator.divide(5,0));
    }
    @Test
    void difference_canBeCalculated(){
        assertEquals(5, calculator.subtract(10,5));
    }
    @Test
    void difference_willProduceAbsoluteResult(){
        assertEquals(5, calculator.subtract(5,10));
    }
}