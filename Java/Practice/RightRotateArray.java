//Java program to rotate an array to the right by one position

class RightRotateArray {
    public static void main(String args[]) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int arraySize = array.length;
        System.out.println("Original Array:");
        for(int element : array) {
            System.out.print(element+" ");
        }
        int lastElement = array[arraySize-1];
        for(int i = arraySize-1; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = lastElement;
        System.out.println("\nArray after right rotation by one position:");
        for(int element : array) {
            System.out.print(element+" ");
        }
    }
}