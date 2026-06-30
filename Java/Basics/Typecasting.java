/*Typecasting in Java.
>There are two types:
1. Primitive Typecasting:
   1.1. Widening Casting (Implicit): Automatically converts a smaller type to a larger type size.
        Flow: byte → short → char → int → long → float → double.
   1.2. Narrowing Casting (Explicit): Manually converts a larger type to a smaller size type.
        Flow: double → float → long → int → char → short → byte.
2. Reference Typecasting:
   2.1. Upcasting: Casting a subclass type to a superclass type.
        Nature: Implicit and automatic.
   2.2. Downcasting: Casting a superclass type to a subclass type.
        Nature: Must be done explicitly by the programmer.
        Requirement: Only possible if the object was originally an instance of that subclass else throws a ClassCastException*/

class Typecasting
{
public static void main(String args[])
{
/*Int to Float/Double
Implicit Casting*/
int number1 = 100;
float floatNumber1 = number1;
double doubleNumber1 = number1;
System.out.println("Int to Float,Double");
System.out.println("Integer Value: "+number1);
System.out.println("Float Value: "+floatNumber1);
System.out.println("Double Value: "+doubleNumber1);

/*Float/Double to Int
Explicit Casting*/
float floatNumber2 = 49.99f; //suffix "f" is added for float else it will be considered double 
double doubleNumber2 = 99.99;
int number2 = (int)floatNumber2;
int number3 = (int)doubleNumber2;
System.out.println("\nFloat,Double to Int");
System.out.println("Float Value: "+floatNumber2);
System.out.println("Float to Integer Value: "+number2);
System.out.println("Double Value: "+doubleNumber2);
System.out.println("Double to Integer Value: "+number3);

//Upcasting
Animal animal = new Dog();
animal.fn1();

//Downcasting
Dog dog = (Dog) animal;
dog.fn2();

/*Int to String
This is not technically Typecasting. Casting only occurs between compatible types. This can be called Type Conversion using specific methods*/
int number4 = 1000;
String str1 = Integer.toString(number4);
String str2 = String.valueOf(number4);
System.out.println("\nInt to String");
System.out.println("Integer Value: "+number4);
System.out.println("String to Integer Value Using Integer.toString(): "+str1);
System.out.println("String to Integer Value Using String.valueOf(): "+str2);

//String to Int
String str3 = "250";
int number5 = Integer.parseInt(str3);
System.out.println("\nString to Int");
System.out.println("String Value: "+str3);
System.out.println("String to Integer Value: "+number5);

}
}

class Animal {
    void fn1() {
        System.out.println("\nAnimal Class");
    }
}

class Dog extends Animal {
    void fn2() {
        System.out.println("\nDog Class");
    }
}