//Java Program to find second largest number in an array

import java.util.Scanner;

class SecondLargestNumber
{
public static void main(String[] args)
{
int largest = Integer.MIN_VALUE,secondLargest = Integer.MIN_VALUE;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of array elements");
int size = sc.nextInt();
if(size<2)
{
System.out.println("Array should contain atleast 2 elements");
return;
}
int[] arr = new int[size];
System.out.println("Enter array elements");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
for (int number : arr)
{
if (number > largest)
{
secondLargest = largest;
largest = number;
}
else if (number > secondLargest && number != largest)
{
secondLargest = number;
}
}
System.out.println("Second Largest Element: " + secondLargest);
}
}