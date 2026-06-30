//Java program implementing Ternary and Instanceof operator

class OperatorsPart4
{
public static void main(String args[])
{
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println("Ternary Operator"); /*Ternary operator is the short form of if-else. (condition) ? true : false;*/
System.out.println(result);

System.out.println("\nInstance Of Operator"); /*Used to check whether the object belongs to the class or not. returns true or false*/
class1 c1 = new class1();
System.out.println("Object c1 belongs to class1: " + (c1 instanceof class1));
System.out.println("Object c1 belongs to class2: " + (c1 instanceof class2));

class2 c2 = new class2();
System.out.println("Object c2 belongs to class1: " + (c2 instanceof class1));
System.out.println("Object c2 belongs to class2: " + (c2 instanceof class2));
//since class2 extends class1 object c2 belongs to both of them
}
}
class class1{}
class class2 extends class1{}