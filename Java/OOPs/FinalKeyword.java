//Final Keyword in Java

/*Final keyword: is used to restrict modification or inheritance.
A final variable cannot be reassigned, method cannot be overridden and a class cannot be inherited by other class.
In Java by default a class can be inherited by other class, to restrict inheritance we use final keyword.*/

class FinalKeyword
{
public static void main(String args[])
{
finalClass finalClassObject = new finalClass();
finalClassObject.finalClassMethod();

class2 class2Object = new class2();
class2Object.class1Method();
class2Object.class2Method();
class2Object.finalMethod();
}
}

final class finalClass
{
String finalClassVariable = "Final Class Variable";
void finalClassMethod()
{
System.out.println("Final Class Method");
System.out.println(finalClassVariable);
}
}

/*class newClass extends finalClass{} this causes an error*/

class class1
{
final String finalVariable = "Class 1 Final Variable";
String class1Variable = "Class 1 Variable";

void class1Method()
{
System.out.println("\nClass 1 Method");
System.out.println(class1Variable);
System.out.println(finalVariable);
/* finalVariable = "New Value"; this causes an error*/
}

final void finalMethod(){System.out.println("Class 1 Final Method");} /*final method can be accessed by inherited classes but it cannot override it*/

}

class class2 extends class1
{
String class2Variable = "Class 2 Variable";

void class2Method()
{
System.out.println("\nClass 2 Method");
System.out.println(class2Variable);
}

/*void finalMethod(){System.out.println("Overridden Final Method");} this causes an error*/
}