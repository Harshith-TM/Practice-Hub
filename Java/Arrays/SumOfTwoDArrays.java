//Java program to find sum of two 2D arrays

class SumOfTwoDArrays
{
public static void main(String args[])
{
int row = 3, column = 3;
int[][] array1 = {{1,3,5},{7,9,11},{13,15,17}};
int[][] array2 = {{2,4,6},{8,10,12},{14,16,18}};
int[][] result = new int[row][column];
System.out.println("Array1 elements:");
for(int i = 0; i < row ; i++){
for(int j = 0; j < column; j++){
System.out.print(array1[i][j]+" ");
}
System.out.println();
}
System.out.println("\nArray2 elements:");
for(int i = 0; i < row ; i++){
for(int j = 0; j < column; j++){
System.out.print(array2[i][j]+" ");
}
System.out.println();
}
//To find sum of the two array elements
for(int i = 0; i < row ; i++){
for(int j = 0; j < column; j++){
result[i][j] = array1[i][j] + array2[i][j];
}
}
System.out.println("\nSum of the Array elements are:");
for(int i = 0; i < row ; i++){
for(int j = 0; j < column; j++){
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
}

/*To find sum of elements for two 2D arrays, Number of rows and columns of both arrays should be same. We must perform element wise addtion i.e., value at each row and column index of first array should be added to value at exact same position in the second array*/