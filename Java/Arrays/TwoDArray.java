//Java program on 2-dimensional array

class TwoDArray
{
public static void main(String args[])
{
//2 dimensional array stores values in tabular form or in rows and columns
int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; 

System.out.println("2D array elements:");
for(int i = 0; i < arr.length ; i++){
for(int j = 0; j < arr[i].length; j++){
System.out.print(arr[i][j]+" "); //to print array elements
}
System.out.println(); //to move to next line after printing an entrie row
}
System.out.println("\nNumber of Rows in 2D array: " +arr.length );
System.out.println("Number of Cloumns in 2D array: " +arr[0].length );
}
}
/*it is always safe to use array[i].length inside loops to avoid arrayindexoutofbounds exception.
Here in 2nd for if arr.length is used, number of rows in array is 4 but number of columns is 3, since there is no 4th column exception wii be thrown*/