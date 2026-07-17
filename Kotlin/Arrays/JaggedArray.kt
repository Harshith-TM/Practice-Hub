//Kotlin program on Jagged Array

fun main()
{

var jaggedArray1 = arrayOf(
intArrayOf(3,2,1),intArrayOf(7,4,5,6),intArrayOf(8)
)

println("Jagged Array Elements")

for(row in jaggedArray1)
{
for(element in row)
{
print("$element ")
}
println()
}

}

/*
A jagged array in Kotlin is an array of arrays where each inner array can have a different number of elements.
It provides flexibility and memory efficiency for storing irregular or uneven data structures.
*/