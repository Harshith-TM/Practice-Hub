//Java Program to sort an array (without using built-in methods)

import java.util.Arrays;

class SortArray
{
public static void main(String args[])
{

int[] array = {-23,14,0,7,-9,31,-16,5,18,-2,27,-11,42,10,-35};
SortingOrder sortingOrder = new SortingOrder();
sortingOrder.ascendingOrder(array);
sortingOrder.descendingOrder(array);

}
}

class SortingOrder
{

void ascendingOrder(int[] array)
{
int arraySize = array.length;
for(int i = 0;i < arraySize; i++)
{
for(int j = i+1;j < arraySize; j++)
{
if(array[i]>array[j])
{
int temp = array[i]; 
array[i] = array[j];
array[j] = temp;
}
}
}
System.out.println("Array sorted in ascending order: ");
System.out.println(Arrays.toString(array));
}

void descendingOrder(int[] array)
{
int arraySize = array.length;
for(int i = 0;i < arraySize; i++)
{
for(int j = i+1;j < arraySize; j++)
{
if(array[i]<array[j])
{
int temp = array[i]; 
array[i] = array[j];
array[j] = temp;
}
}
}
System.out.println("Array sorted in descending order: ");
System.out.println(Arrays.toString(array));
}

}