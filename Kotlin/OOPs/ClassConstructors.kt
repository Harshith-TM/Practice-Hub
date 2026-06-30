//Kotlin program for class constructors

/* Constructors: A special method in a class that is automatically called when an object is created to initialize the object.
No need of Destructor in Kotlin because it automatically handles it using garbage collector. */

fun main()
{
val user1 = User()

val user2 = User("Bramha",25,"email-id@email.com")

val user3 = User("Vishnu",25,"email-id@email.com","123456789")
}

class User(var name:String="Shiva", var age:Int=25, var email:String="email-id@email.com")
{
init //to perform complex operations during initialization put that code in initializer block using "init" keyword. multiple init blocks can be used
{
println("Initilalizer Block")
println("Name: $name")
println("Age: $age")
println("Email: $email")
println("--------------------\n")
}

constructor(name:String, age:Int, email:String, phone:String):this(name,age,email)
{
println("Secondary Construtor")
println("Phone: $phone")
println("--------------------\n")
}
}

/*The primary constructor sets up the initial state of an instance when it's created.(similar to default constructor in Java)
>To declare a primary constructor, place it in the class header after the class name:
 class User constructor(name: String) {}
>If the primary constructor doesn't have any annotations or visibility modifiers, you can omit the constructor keyword:
 class User(name: String){}
>The primary constructor can declare parameters as properties. Use the val keyword before the argument name to declare a read-only property and the var keyword for a mutable property:
 class Person(val name: String, var age: Int) {}
>These constructor parameter properties are stored as part of the instance and are accessible from outside the class.
>You can also assign default values to properties in the primary constructor:
 class Person(val name: String = "John", var age: Int = 30) {}
>If no value is passed to the constructor during instance creation, properties use their default value.

Secondary constructors are useful when you need multiple ways to initialize a class or for Java interoperability.
>To declare a secondary constructor, use the constructor keyword inside the class body with the constructor parameters within parentheses ().
 Add the constructor logic within curly braces {}
>In Kotlin, secondary constructors must delegate to the primary constructor.
 This delegation ensures that all primary constructor initialization logic is executed before any secondary constructor logic runs.
 [delegation means one constructor calls another constructor of the same class to perform initialization.]
>Constructor delegation can be:
 Direct, where the secondary constructor calls the primary constructor immediately.
 Indirect, where one secondary constructor calls another, which in turn delegates to the primary constructor.*/