package learn;

import java.util.Scanner;

public class LearnArray7 {

    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter the size of array.");
            int arraySize = scan.nextInt();
            int[] inputArray = new int[arraySize];

            for (int i = 0; i < arraySize; i++) {
                System.out.println("Please enter the " + (i + 1) + "th element of array.");
                inputArray[i] = scan.nextInt();
            }

            int maxElement = Integer.MIN_VALUE;
            for (int i = 0; i < arraySize; i++) {
                maxElement = Math.max(maxElement, inputArray[i]);
            }

            int[] frequencyArray = new int[maxElement + 1];
            for (int i = 0; i < arraySize; i++) {
                frequencyArray[inputArray[i]]++;
            }

            int count = 0;
            for (int i = 0; i <= maxElement; i++) {
                if (frequencyArray[i] >= 2) {
                    count++;
                }
            }

            System.out.println(count);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}