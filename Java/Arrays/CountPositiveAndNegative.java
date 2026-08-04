//Java program to count positive and negative numbers in an Array

class CountPositiveAndNegative
{
public static void main(String args[])
{

int positiveCount=0,negativeCount=0,zerosCount=0;
int[] numberArray = {12, -7, 0, 45, -19, 8, 0, -3, 27, -14, 6, 0, -25, 31, -1};
int arraySize = numberArray.length;

for(int i=0;i<arraySize;i++)
{
if(numberArray[i]>0)
{
positiveCount++;
}
else if(numberArray[i]<0)
{
negativeCount++;
}
else
{
zerosCount++;
}
}
System.out.println("Number of Zeros in the Array: "+zerosCount);
System.out.println("Number of Positive Numbers in the Array: "+positiveCount);
System.out.println("Number of Negative Numbers in the Array: "+negativeCount);

}
}