//Kotlin program to find duplicate elements in an Array

fun main()
{

val array = arrayOf(5,9,45,48,74,31,0,-1,0,48,69,-78,78,5,-1)
val arraySize = array.size
var count = 0
var duplicatesArray = IntArray(arraySize)

for(i in 0 until arraySize)
{
for(j in i+1 until arraySize)
{
if(array[i]==array[j])
{
duplicatesArray[count] = array[i]
count++
}
}
}
println("Number of Duplicate Elements in the Array: $count")
println("Duplicate Elements in the Array: ")
for(i in 0 until count)
{
print("${duplicatesArray[i]} ")
}

}