//Java program for inheritance

/*OOPs Inheritance is a concept where a class acquires variables and methods of another class,
we can implement inheritance in java using extend keyword.
>A parent class or superclass is the class whose properties and methods are inherited by another class.
>A child class or superclass is the class that inherits the properties and methods of parent class.
[Note: Super Keyword, the super keyword is used to refer to the immediate parent class object.
 super.variableName;
 super.methodName;
 super(); parent class constructor]
*/

class OopsInheritance
{
public static void main(String args[])
{
class2 class2Object = new class2();
class2Object.class1Method();
class2Object.class2Method();
class2Object.displayClassName();
}
}

class class1
{
String class1Variable = "Class 1 Variable";
String name = "Parent Class";
void class1Method()
{
System.out.println("Class 1 Method");
System.out.println(class1Variable);
}
}

class class2 extends class1
{
String class2Variable = "Class 2 Variable";
String name = "Child Class";
void class2Method()
{
System.out.println("\nClass 2 Method");
System.out.println(class2Variable);
}
void displayClassName()
{
System.out.println("");
System.out.println(super.name); //using super keyword to access parent class variable
System.out.println(name);
}
}