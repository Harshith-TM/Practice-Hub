//Java program related to arrays

class Arrays
{
public static void main(String args[])
{
//array index starts from 0 i.e., starting point of the array is 0
int[] array1 = new int[2]; //Declaring and initialising without values.
array1[0] = 1;
array1[1] = 2;
int[] array2 = {10,20,30,40,50,60,70,80,90,100}; //Declaring and initialising with values.

System.out.println("Arrays");
System.out.println("\nAccessing single element from an array");
System.out.println("array1[0]: " +array1[0]);
System.out.println("array1[1]: " +array1[1]);

System.out.println("\nLength of array1");
System.out.println("Length: " +array1.length);
System.out.println("\nLength of array2");
System.out.println("Length: " +array2.length);

System.out.println("\nAccessing all elements from an array");
for(int i=0;i<array2.length;i++){
System.out.println("array2["+i+"]: " +array2[i]);
}
}
}