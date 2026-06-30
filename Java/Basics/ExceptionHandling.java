//Java Exception Handling

class ExceptionHandling
{
public static void main(String args[])
{

try
{
int a = 10/0;
System.out.println(a);
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("Cannot Divide by Zero");
}

}
}

/*

What is an Exception?
An exception is an event that occurs during program execution and disrupts the normal flow of the program.
Exception handling in Java is a mechanism for handling runtime errors so that the normal flow of the program can continue.

| Keyword   | Purpose                                            |
| --------- | -------------------------------------------------- |
| `try`     | Code that may throw an exception                   |
| `catch`   | Handles the exception                              |
| `finally` | Executes regardless of whether an exception occurs |
| `throw`   | Explicitly throws an exception                     |
| `throws`  | Declares exceptions that a method may throw        |

Some Common Exceptions

>ArithmeticException
>NullPointerException
>ArrayIndexOutOfBoundsException
>NumberFormatException
>FileNotFoundException

The root class for exceptions is Throwable, but exceptions are mainly represented by the Exception class. Checked exceptions extend Exception class, while unchecked exceptions extend RuntimeException class.
*/