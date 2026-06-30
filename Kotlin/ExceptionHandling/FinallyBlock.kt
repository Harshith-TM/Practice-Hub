//Kotlin Exception Handling Finally Block

/*
The finally block is a part of exception handling that contains code that always executes after the try and catch blocks,
whether an exception occurs or not

It is commonly used to release resources such as:
>Closing files
>Closing database connections
>Closing network sockets
>Releasing other system resources
*/

fun main()
{

try
{
var a = intArrayOf(0,1,2,3,4)
println(a[10])
}
catch(e: ArrayIndexOutOfBoundsException)
{
println(e)
println("Array Index Out of Bounds")
}
finally
{
println("Finally Block Exceuted")
}

}