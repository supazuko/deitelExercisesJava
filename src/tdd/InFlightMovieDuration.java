package tdd;

public class InFlightMovieDuration {

    public static Object sumOfLengthOfTwoMoviesEqualsDurationOfFlight(int[] moviesDuration, int flightDuration) {
        boolean isEqual = false;
        int firstMovieDuration;
        int secondMovieDuration;
        for (int i = 0; i < moviesDuration.length; i++) {
            firstMovieDuration = moviesDuration[i];

            for (int counter = 0; counter < moviesDuration.length; counter++) {
                secondMovieDuration = moviesDuration[counter];
                if (firstMovieDuration + secondMovieDuration == flightDuration){
                    isEqual = true;
                    break;
                }
            }
        }
        return isEqual;
    }
}
