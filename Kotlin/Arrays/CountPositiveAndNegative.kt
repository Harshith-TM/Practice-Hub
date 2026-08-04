//Kotlin program to count positive and negative numbers in an Array

fun main()
{

var positiveCount=0;var negativeCount=0;var zerosCount=0
var numberArray = arrayOf(12, -7, 0, 45, -19, 8, 0, -3, 27, -14, 6, 0, -25, 31, -1)
val arraySize = numberArray.size

for(i in 0 until arraySize)
{
if(numberArray[i]>0)
{
positiveCount++
}
else if(numberArray[i]<0)
{
negativeCount++
}
else
{
zerosCount++
}
}
println("Number of Zeros in the Array: $zerosCount")
println("Number of Positive Numbers in the Array: $positiveCount")
println("Number of Negative Numbers in the Array: $negativeCount")

}