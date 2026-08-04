//Java Program to check if an array is sorted

class ArraySortedOrNot {
    public static void main(String args[]) {
        int[] array1 = {0,1,2,3,4,5};
        int[] array2 = {5,4,3,2,1,0};
        int[] array3 = {5,1,3,2,4,0};
        int[] array4 = {-8,5,-1,2,10,0};
        
        System.out.println("Is Array1 Sorted: "+isSorted(array1));
        System.out.println("Is Array2 Sorted: "+isSorted(array2));
        System.out.println("Is Array3 Sorted: "+isSorted(array3));
        System.out.println("Is Array4 Sorted: "+isSorted(array4));
    }
    static boolean isSorted(int[] array) {
        boolean ascendingOrder = true,descendingOrder = true;
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]) {
                ascendingOrder = false;
            }
            if(array[i] < array[i+1]) {
                descendingOrder = false;
            }
        }
        return ascendingOrder || descendingOrder;
    }
}