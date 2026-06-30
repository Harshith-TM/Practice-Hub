//Kotlin program on OOPs Basics, Class and Objects

fun main()
{
val user = User() //object
user.displayDetails()
}

class User //class
{
val name = "Vishnu"
val age = 25
val email = "email-id@email.com"

fun displayDetails()
{
println("-- User Details --")
println("Name: $name")
println("Age: $age")
println("Email: $email")
}
}

/*
Class : Class blueprint or templates for creating objects, it contains properties(variables) and behaviour(methods) that objects will have. 
        >To create a class we use "class" keyword.
        >No memory allocation for data members util objects are created.
Objects : Object is the instance of the class and can access variables and methods defined in the class.
          >To create an object we call class constructor.
          >Memory is allocated when object is created.
*/