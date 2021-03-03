package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTestNew {
    private Kata testDriller;
    @BeforeEach
    void startAllTestsWithThis(){
        testDriller = new Kata();
    }
    @Test
    void purchaseOneUnitOfTestDrillerTest(){
        assertEquals(1500,testDriller.calculatePriceFor(1));
    }
    @Test
    void purchaseFourUnitsOfTestDrillerTest(){
        assertEquals(6000, testDriller.calculatePriceFor(4));
        assertEquals(4500, testDriller.calculatePriceFor(3));
    }
    @Test
    void purchaseFiveUnitsOfTestDrillerTest(){
        assertEquals(1400*5, testDriller.calculatePriceFor(5));
        assertEquals(1400*9, testDriller.calculatePriceFor(9));
    }
    @Test
    void purchaseElevenUnitsOfTestDrillerTest(){
        assertEquals(1200*11, testDriller.calculatePriceFor(11));
        assertEquals(1200*28, testDriller.calculatePriceFor(28));
    }
    @Test
    void purchaseThirtyUnitsOfTestDrillerTest(){
        assertEquals(1100*30, testDriller.calculatePriceFor(30));
        assertEquals(1100*48, testDriller.calculatePriceFor(48));
    }
    @Test
    void purchaseFiftyToNinetyNineUnitsOfTestDrillerTest(){
        assertEquals(1000*50, testDriller.calculatePriceFor(50));
        assertEquals(1000*99, testDriller.calculatePriceFor(99));
    }
    @Test
    void purchaseHundredUnitsOfTestDrillerTest(){
        assertEquals(900*100, testDriller.calculatePriceFor(100));
        assertEquals(900*199, testDriller.calculatePriceFor(199));
    }
    @Test
    void purchaseAboveTwoHundredUnitsOfTestDrillerTest(){
        assertEquals(800*245, testDriller.calculatePriceFor(245));
        assertEquals(800*690, testDriller.calculatePriceFor(690));
    }
}