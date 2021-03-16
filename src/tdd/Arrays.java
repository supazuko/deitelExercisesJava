package tdd;

public class Arrays {
    public int sumOfArray(int[] a) {
        int total = 0;
        for (int counter = 0; counter < a.length; counter++) {
            total += a[counter];
        }return total;
    }
    public double averageOfArray(int[] a) {
        double average = 0.0;
        int total;
        for (int counter = 0; counter < a.length; counter++) {
            total = sumOfArray(a);
            average = (double) total/a.length;
        }return average;
    }
    public int getMinOfArray (int[] a){
        int minElement = a[0];
        for (int counter = 0; counter < a.length; counter++) {
            if (a[counter] < minElement){
                minElement = a[counter] ;
            }
        }return minElement;
    }
    public int getMaxOfArray (int[] a){
        int maxElement = a[0];
        for (int counter = 0; counter < a.length; counter++) {
            if (a[counter] > maxElement){
                maxElement = a[counter] ;
            }
        }return maxElement;
    }
    public int getCombinationOfMaximumElements(int[] a){
        return sumOfArray(a) - getMinOfArray(a);
    }
    public int getCombinationOfMinimumElements(int[] a){
        return sumOfArray(a) - getMaxOfArray(a);
    }
}
