//Java program for variables and its scope

class ScopeOfVariables
{
int instanceVar = 10; /*Belongs to Instance of the class. Can also be accessed by methods with-in the class*/
static int staticVar = 50; /*Belongs to the class rather than the instance. Can also be accessed by methods with-in the class*/
void display(int parameterVar)
{
int localVar = 150; //this is accessible with-in this function only.
System.out.println("Parameter Variable: "+parameterVar);
System.out.println("Local Variable: "+localVar);
System.out.println("Instance Variable: "+instanceVar);
System.out.println("Static Variable: "+staticVar);

if(localVar>0)
{
int blockVar = 200; //this is accessible with-in this block only.
System.out.println("Block Variable: "+blockVar);
}
}
public static void main(String args[])
{
ScopeOfVariables object1 = new ScopeOfVariables();
object1.display(100);
System.out.println("\nAfter Changing Instance and Static Variables\n");
object1.instanceVar = 20;
ScopeOfVariables.staticVar = 60; /*static variables of a class can be accessed without the instance of the class or the object*/
object1.display(110);
}
}