//Java static keyword

/*Static keyword is used to create members of the class that belong to the class itself, rather than the instance(object) of the class.
If a member(a variable or a method) of the class is static there is only one copy shared by everyone. If its non-static, every new object gets its own copy.*/

class StaticKeyword
{
public static void main(String args[])
{
StaticKeywordExample.staticMethod(); //static methods of the class can be called without creating objects, as static members belongs to class not the instance
StaticKeywordExample s = new StaticKeywordExample(); //non static methods of the class need to be instantiated using objects, only then it can be used
s.nonStaticMethod();
}
}

class StaticKeywordExample
{
String nonStaticString = "Non Static Attribute";
static String staticString = "Static Attribute";
static void staticMethod()
{
System.out.println("Static Method");
System.out.println("Static Attribute: "+staticString);
//System.out.println("Non Static Attribute: "+nonStaticString);
//this prints error as static methods cannot access non static members of class
}
void nonStaticMethod()
{
System.out.println("\nNon Static Method");
System.out.println("Non Static Attribute: "+nonStaticString);
System.out.println("Static Attribute: "+staticString);
}
}