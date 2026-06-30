//Java Polymorphism, Method Overriding

class MethodOverrding
{
public static void main(String args[])
{
class1 class1Object = new class1();
class1Object.OverrideMethod();

class2 class2Object = new class2();
class2Object.OverrideMethod();
}
}

class class1
{
void OverrideMethod()
{
System.out.println("Method from Class1");
} 
}

class class2 extends class1
{
@Override
void OverrideMethod() /*while overriding @Override annotation is recommended but not compulsory, methods that are final cannot be overridden*/
{
System.out.println("\nMethod from Class1 Overridden by Class2");
} 
}