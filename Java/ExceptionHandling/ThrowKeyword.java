//Java Exception Handling Throw Keyword

/*The throw keyword is used to explicitly throw an exception from a method or block of code, When Java encounters a problem, it can automatically throw exceptions (like NullPointerException) but sometimes you want to manually trigger an exception — that’s where throw is used.*/

class ThrowKeyword
{
public static void main(String args[])
{

try
{
int number = -5;
if(number<0)
{
throw new IllegalArgumentException("Negative Number Not Allowed");
}
else
{
System.out.println(number);
}
}
catch(IllegalArgumentException e)
{
System.out.println(e);
}

}
}