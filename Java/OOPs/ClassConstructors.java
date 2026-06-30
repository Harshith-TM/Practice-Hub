//Java program for class constructors

/* Constructors: A special method in a class that is automatically called when an object is created to initialize the object.
No need of Destructor in Java because it automatically handles it using garbage collector. */

class ClassConstructors
{
public static void main(String args[])
{
User user1 = new User();
user1.printDetails();

User user2 = new User("Bramha",24,"brahma@email.com");
user2.printDetails();

User user3 = new User("Vishnu",25,"vishnu@email.com");
user3.printDetails();

User user4 = new User(user3);
user4.printDetails();
}
}

class User
{
String name, email;
int age;

/*Default Constructor: A Constructor with no parameters that initializes an object with default values.*/
public User() //default constructor
{
this.name = "Shiva";
this.age = 25;
this.email = "shiva@email.com";
System.out.println("Default Constructor");
}

/*Parameterized Constructor: A Constructor that accepts parameters to initialize an object with user-defined values.*/
public User(String name, int age, String email) //parameterized constructor with default values
{
this.name = name;
this.age = age;
this.email = email;
System.out.println("Parameterized Constructor");
}

/*Copy Constructor: A Constructor that creates a new object by copying the values of another object of same class.[Java does not provide a built-in copy constructor, it can be created manually.]*/
public User(User userObject) //copy constructor
{
this.name = userObject.name;
this.age = userObject.age;
this.email = userObject.email;
System.out.println("Copy Constructor");
}

public void printDetails()
{
System.out.println("-- User Details--");
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Email: "+email);
System.out.println("--------------------\n");
}
}