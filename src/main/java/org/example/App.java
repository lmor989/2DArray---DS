package org.example;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static int hourglassSum(int[][] arr) {
        int currentHourGlassNum = 0;
        int maxHourGlassSum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                for (int k = j - 1; k <= j + 1; k++) {
                    currentHourGlassNum += arr[i - 1][k];
                    currentHourGlassNum += arr[i + 1][k];
                }
                currentHourGlassNum += arr[i][j];
                if (currentHourGlassNum > maxHourGlassSum) {
                    maxHourGlassSum = currentHourGlassNum;
                }
                currentHourGlassNum = 0;
            }
        }

        return maxHourGlassSum;
    }
}
