//Java program for array functions

import java.util.Arrays;

class ArrayFunctions
{
public static void main(String args[])
{
int[] array1 = {8,5,10,13,1};

//Array Length
System.out.println("Array Length: " +(array1.length)); //Returns the number of elements in the array

//Converting Array to a String
String strArray = Arrays.toString(array1);
System.out.println("Array to String: "+strArray); //Converts array into readable string format

//Sorting an Array
System.out.println("\nSorted Array: ");
Arrays.sort(array1);
System.out.println("Sorted Array: "+(Arrays.toString(array1))); //Sorts the array elements in ascending order

//Comparing two Arrays
int[] array2 = {1,5,8,10,13};
int[] array3 = {1,2,3,4,5};
System.out.println("\nComparing two Arrays");
System.out.println("array1 equals to array2: "+(Arrays.equals(array1,array2))); //Compares two arrays and check if they are equal or not
System.out.println("array1 equals to array3: "+(Arrays.equals(array1,array3)));

//Copying an array
int[] copyOfArray1 = Arrays.copy(array1,10);
System.out.println("\nCopy of array1:\n"+(Arrays.toString(copyOfArray1))); /*Creates a copy of the array with specified size. If the original array has less elements than the size specified for the copy it fills the empty positions with zeros*/

//Filling an array
int[] filledArray = new int[5];
Arrays.fill(filledArray,10);
System.out.println("\nFilled array:\n"+(Arrays.toString(filledArray))); //Fills all elements of the array with given value

//Binary Search an sorted array
int position = Arrays.binarySearch(array1,13);
System.out.println("\nPosition of number 13 in sorted array1:\n"+position); //Search for an element in a sorted array and returns its index/position

}
}