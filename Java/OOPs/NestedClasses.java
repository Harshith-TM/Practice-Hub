//Java program for Nested Classes

class NestedClasses
{
public static void main(String args[])
{
OuterClass outer = new OuterClass();
outer.outerClassMethod();

OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass(); //Static inner class can be instantiated using outer class rather than its object
staticInner.staticInnerClassMethod();

OuterClass.InnerClass inner = outer.new InnerClass(); //Non static inner class needs outer class object to be instantiated
inner.innerClassMethod();

outer.methodInnerClass();
}
}

class OuterClass
{
//Outer class can only access members and methods of Inner class using an object of the Inner Class

String outerClassVariable = "Outer class variable";
static String staticOuterClassVariable = "Outer class Static variable";

void outerClassMethod()
{
System.out.println("Outer Class");
System.out.println(outerClassVariable);
System.out.println(staticOuterClassVariable);
}

static class StaticInnerClass
{
//Static inner class can only access static members and methods of outer class

String staticInnerClassVariable = "Static Inner class variable";
void staticInnerClassMethod()
{
System.out.println("\nStatic Inner Class");
System.out.println(staticInnerClassVariable);
System.out.println(staticOuterClassVariable);
/*System.out.println(innerClassVariable); System.out.println(outerClassVariable); this causes an error as static members cannot access non-static members*/
}
}

class InnerClass
{
//Non static inner class can access all the members and methods of outer class including private ones

String innerClassVariable = "Inner class variable";
void innerClassMethod()
{
System.out.println("\nInner Class");
System.out.println(innerClassVariable);
System.out.println(outerClassVariable);
System.out.println(staticOuterClassVariable);
}
}

void methodInnerClass()
{
class localInnerClass
{
String localInnerClassVariable = "Local Inner class variable";
}
localInnerClass local = new localInnerClass();
System.out.println("\n"+local.localInnerClassVariable);
/*classes can also be declared within block or a method of other class.
But it can only be accessed within that block or method, though it should still be instantiated.*/
}

}