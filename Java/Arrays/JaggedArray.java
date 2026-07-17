//Java program on Jagged Array

class JaggedArray
{
public static void main(String args[])
{

int[][] jaggedArray1 = new int[3][];
jaggedArray1[0] = new int[] {3,2,1};
jaggedArray1[1] = new int[] {7,4,5,6};
jaggedArray1[2] = new int[] {8};

System.out.println("Jagged Array Elements");

for(int i = 0; i < jaggedArray1.length; i++)
{
for(int j = 0; j < jaggedArray1[i].length; j++)
{
System.out.print(jaggedArray1[i][j]+" ");
}
System.out.println();
}

}
}

/*
A jagged array in Java is an array of arrays where each inner array can have a different number of elements.
It provides flexibility and memory efficiency for storing irregular or uneven data structures.
*/