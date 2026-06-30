//Java Exception Handling Finally Block

/*
The finally block is a part of exception handling that contains code that always executes after the try and catch blocks,
whether an exception occurs or not

It is commonly used to release resources such as:
>Closing files
>Closing database connections
>Closing network sockets
>Releasing other system resources
*/

class FinallyBlock
{
public static void main(String args[])
{

try
{
int[] a = {1,2,3,4,5};
System.out.println(a[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
System.out.println("Array Index Out of Bounds");
}
finally
{
System.out.println("Finally Block Exceuted");
}

}
}