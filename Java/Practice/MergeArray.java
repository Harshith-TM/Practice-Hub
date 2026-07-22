//Java program to merge two arrays into one

import java.util.Arrays;

class MergeArray
{
    public static void main(String args[])
    {
        int[] array1 = {4,-2,0,7,-5,1,0,-8};
        int[] array2 = {-3,9,0,-1,5,-7};
        int array1Size = array1.length;
        int array2Size = array2.length;
        int totalSize = array1Size + array2Size;
        int[] mergedArray = new int[totalSize];
        int index = 0;
        for(int i = 0; i < array1Size; i++)
        {
            mergedArray[index] = array1[i];
            index++;
        }
        for(int i = 0; i <  array2Size; i++)
        {
            mergedArray[index] = array2[i];
            index++;
        }
        System.out.println("Array1: "+Arrays.toString(array1)+", Size: "+array1Size);
        System.out.println("Array2: "+Arrays.toString(array2)+", Size: "+array2Size);
        System.out.println("Merged Array: "+Arrays.toString(mergedArray)+", Size: "+totalSize);
    }
}