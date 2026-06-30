//Kotlin Exception Handling

fun main()
{

try
{
var a = 10/0
println(a)
}
catch(e: ArithmeticException)
{
println(e)
println("Cannot Divide by Zero")
}

}


/*

What is an Exception?
An exception is an event that occurs during program execution and disrupts the normal flow of the program.
Exception Handling is same as Java as Kotlin runs on JVM but in Kotlin no checked exceptions.

| Keyword   | Purpose                                            |
| --------- | -------------------------------------------------- |
| `try`     | Code that may throw an exception                   |
| `catch`   | Handles the exception                              |
| `finally` | Executes regardless of whether an exception occurs |
| `throw`   | Explicitly throws an exception                     |

Some Common Exceptions

>ArithmeticException
>NullPointerException
>ArrayIndexOutOfBoundsException
>NumberFormatException
>FileNotFoundException

*/