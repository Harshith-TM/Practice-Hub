//Kotlin Exception Handling Throw Keyword

/*The throw keyword is used to explicitly throw an exception from a method or block of code, When Kotlin encounters a problem, it can automatically throw exceptions (like NullPointerException) but sometimes you want to manually trigger an exception — that’s where throw is used.*/

fun main()
{

try
{
val number = -5
if(number<0)
{
throw IllegalArgumentException("Negative Number Not Allowed")
}
else
{
println(number)
}
}
catch(e: IllegalArgumentException)
{
println(e)
}

}