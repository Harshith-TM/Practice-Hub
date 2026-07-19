//Java program to find duplicate elements in an Array

class FindDuplicate
{
public static void main(String args[])
{

int[] array = {5,9,45,48,74,31,0,-1,0,48,69,-78,78,5,-1};
int arraySize = array.length;
int count = 0;
int[] duplicatesArray = new int[arraySize];

for(int i = 0;i < arraySize; i++)
{
for(int j = i+1;j < arraySize; j++)
{
if(array[i]==array[j])
{
duplicatesArray[count] = array[i];
count++;
}
}
}
System.out.println("Number of Duplicate Elements in the Array: "+count);
System.out.println("Duplicate Elements in the Array: ");
for(int i = 0;i < count; i++)
{
System.out.print(duplicatesArray[i]+" ");
}

}
}