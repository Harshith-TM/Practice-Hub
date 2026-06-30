//Kotlin program on 2-dimensional array

fun main()
{
//2 dimensional array stores values in tabular form or in rows and columns
val arr = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9),arrayOf(10,11,12))
println("2D array elements:")
for(i in arr.indices){
for(j in arr[i].indices){
print("${arr[i][j]} ") //to print array elements
}
println() //to move to next line after printing an entrie row
}
println("\nNumber of Rows in 2D array: ${arr.size}")
println("Number of Cloumns in 2D array: ${arr[0].size}")
}
/*it is always safe to use array[i].length inside loops to avoid arrayindexoutofbounds exception.
Here in 2nd for if arr.length is used, number of rows in array is 4 but number of columns is 3, since there is no 4th column exception wii be thrown*/