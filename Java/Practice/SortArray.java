//Java Program to sort an array in ascending order (without using built-in methods)

import java.util.Arrays;

class SortArray
{
public static void main(String args[])
{

int[] array = {-23,14,0,7,-9,31,-16,5,18,-2,27,-11,42,10,-35};
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
System.out.println("Sorted Array: ");
System.out.println(Arrays.toString(array));

}
}