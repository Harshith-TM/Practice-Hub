//Kotlin Companion Object

/*Companion object is used to create members of the class that belong to the class itself, rather than the instance(object) of the class.
If a member(a variable or a method) of the class is placed inside companion object there is only one copy shared by everyone. If its not, every new object gets its own copy.*/

fun main()
{
CompanionObjectExample.companionObjectMethod() //members inside companion object can be called without creating objects, as it belongs to class not the instance
val c = CompanionObjectExample() //other methods of the class need to be instantiated using objects, only then it can be used
c.normalMethod()
}

class CompanionObjectExample
{
val normalString = "Normal Attribute"
fun normalMethod()
{
println("\nNormal Method")
println("Normal Attribute: $normalString")
println("Companion Object Attribute: $companionObjectString")
}
companion object
{
val companionObjectString = "Companion Object Attribute"
fun companionObjectMethod()
{
println("Companion Object Method")
println("Companion Object Attribute: $companionObjectString")
//println("Normal Attribute: $normalString")
//this prints error as members inside companion object cannot access other members of class
}
}
}

/*
Note:
>One class can only have one companion object
>When you declare a companion object without giving it a specific name, Kotlin automatically names it Companion behind the scenes.
ex: class c1{companion object{val a = 10}} //no name is given here
    fun main(){
    println(c1.a)
    println(c1.Companion.a)
    } companion object members can be called using class name or default hidden name(Companion if no name is given)
    
    class c2{companion object objectName{val a = 10}} //no name is given here
    fun main(){
    println(c2.a)
    println(c2.objectName.a)
    }
*/