//Java program for hierarchical inheritance

//multiple subclasses inherit from a single superclass

class HierarchicalInheritance
{
public static void main(String args[])
{
class2 class2Object = new class2();

class2Object.class2Method();
class2Object.class1Method();

class3 class3Object = new class3();

class3Object.class3Method();
class3Object.class1Method();
}
}

class class1
{
String class1Variable = "Class 1 Variable";
void class1Method()
{
System.out.println("Class 1 Method");
System.out.println(class1Variable);
}
}

class class2 extends class1
{
String class2Variable = "Class 2 Variable";
void class2Method()
{
System.out.println("\nClass 2 Method");
System.out.println(class2Variable);
}
}

class class3 extends class1
{
String class3Variable = "Class 3 Variable";
void class3Method()
{
System.out.println("\nClass 3 Method");
System.out.println(class3Variable);
}
}