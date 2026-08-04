//Kotlin program to find sum of two 2D arrays

fun main()
{
val row = 3; val column = 3
val array1 = arrayOf(arrayOf(1,3,5),arrayOf(7,9,11),arrayOf(13,15,17))
val array2 = arrayOf(arrayOf(2,4,6),arrayOf(8,10,12),arrayOf(14,16,18))
var result = Array(row){ IntArray(column)}
println("array1 elements:")
for(i in 0 until row){
for(j in 0 until column){
print("${array1[i][j]} ")
}
println()
}
println("\narray2 elements:")
for(i in 0 until row){
for(j in 0 until column){
print("${array2[i][j]} ")
}
println()
}
//To find sum of the two array elements
for(i in 0 until row){
for(j in 0 until column){
result[i][j] = array1[i][j] + array2[i][j]
}
}
println("\nSum of the Array elements are:");
for(i in 0 until row){
for(j in 0 until column){
print("${result[i][j]} ");
}
println();
}
}

/*To find sum of elements for two 2D arrays, Number of rows and columns of both arrays should be same. We must perform element wise addtion i.e., value at each row and column index of first array should be added to value at exact same position in the second array*/