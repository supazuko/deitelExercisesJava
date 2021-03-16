package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysTest {
    private Arrays testDriller;
    @BeforeEach
    void startAllTestsWithThis(){
        testDriller = new Arrays();
    }

    @Test
    void sumOfArrayElementsTest(){
        int[] a = {2, 4, 6, 8, 10};
        assertEquals(30, testDriller.sumOfArray(a));
    }
    @Test
    void averageOfArrayElementsTest(){
        int[] a = {20, 8, -6, 569, 89, 33, 23, 90};
        assertEquals(103.25, testDriller.averageOfArray(a));
    }
    @Test
    void minElementOfArrayTest(){
        int[] a = {67, 4, 36, 98, 19};
        assertEquals(4, testDriller.getMinOfArray(a));
    }
    @Test
    void maxElementOfArrayTest(){
        int[] a = {4, 64, 56, 48, 10, 76, 0, -34};
        assertEquals(76, testDriller.getMaxOfArray(a));
    }
    @Test
    void totalOfElementsMinusMaximumElementTest(){
        int[] a = {2, 4, 6, 8, 10};
        assertEquals(20, testDriller.getCombinationOfMinimumElements(a));
    }
    @Test
    void totalOfElementsMinusMinimumElementTest(){
        int[] a = {2, 4, 6, 8, 10};
        assertEquals(28, testDriller.getCombinationOfMaximumElements(a));
    }
}
