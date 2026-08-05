/*Given an integer array that does not contain any zeros, find the largest positive integer k such that -k also exists in the array. Return the positive integer k. If there is no such integer, return -1*/

import java.util.Scanner;

class LargestPositive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer array, with space to seperate each element");
        String[] input = sc.nextLine().split("\\s+");

        int arraySize = input.length;
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        
        int largestNumber = findLargest(array,arraySize);
        
        if(largestNumber>0) {
            System.out.println("Largest positive number in array that has its alternative negative number is: " +largestNumber);
        } else {
            System.out.println("No such element found");
        }
    }

    static int findLargest(int[] array, int arraySize)
    {
        int largest = -1;
        for(int i=0; i<arraySize; i++) {
            for(int j=i+1; j<arraySize; j++) {
                int sum = array[i]+array[j];
                if(sum==0) {
                    largest = Math.max(largest,Math.abs(array[i]));
                }
            }
        }
        return largest;
    }
}