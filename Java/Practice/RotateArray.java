//Java program to rotate an array to the right by one position

import java.util.Arrays;

class RotateArray{
    public static void main(String args[]) {
        int[] originalArray = {0,1,2,3,4,5,6,7,8,9};
        int arraySize = originalArray.length;
        int[] rightArray = Arrays.copyOf(originalArray,arraySize);
        int[] leftArray = Arrays.copyOf(originalArray,arraySize);
        
        ArrayRotation arrayRotation = new ArrayRotation();
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(originalArray));
        System.out.println("Rigth Rotate:");
        arrayRotation.RightRotate(rightArray);
        System.out.println("Left Rotate:");
        arrayRotation.LeftRotate(leftArray);
    }
}
class ArrayRotation{
    void RightRotate(int[] array) {
        int arraySize = array.length;
        int lastElement = array[arraySize-1];
        for(int i = arraySize-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = lastElement;
        System.out.println(Arrays.toString(array));
    }
    void LeftRotate(int[] array) {
        int arraySize = array.length;
        int firstElement = array[0];
        for(int i = 0; i < arraySize-1; i++) {
            array[i] = array[i+1];
        }
        array[arraySize-1] = firstElement;
        System.out.println(Arrays.toString(array));
    }
}