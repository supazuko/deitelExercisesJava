package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InFlightMovieDurationTest {

    @Test
    void sumOfLengthOfTwoMoviesEqualsDurationOfFlightTest(){
        int[] moviesDuration = {120, 144, 200, 116};
        int flightDuration = 260;
        assertTrue((Boolean) InFlightMovieDuration.sumOfLengthOfTwoMoviesEqualsDurationOfFlight(moviesDuration, flightDuration));
    }
}
