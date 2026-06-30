//Java Program on OOPs Basics, Class and Objects

class ClassesAndObjects
{
public static void main(String args[])
{
User user = new User();
user.displayDetails();
}
}

class User
{

String name = "Vishnu";
int age = 25;
String email = "email-id@email.com";

void displayDetails()
{
System.out.println("-- User Details --");
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Email: "+email);
}

}

/*
Class : Class blueprint or templates for creating objects, it contains properties(variables) and behaviour(methods) that objects will have. 
        >To create a class we use "class" keyword.
        >No memory allocation for data members util objects are created.
Objects : Object is the instance of the class and can access variables and methods defined in the class.
          >To create an object we "new" keyword along with class constructor.
          >Memory is allocated when object is created.
*/