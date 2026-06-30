//Kotlin program for variables and its scope

class ScopeOfVariables
{
var instanceVar = 10 /*Belongs to Instance of the class. Can also be accessed by methods with-in the class*/
companion object
{ 
var staticVar = 50 /*Companion object in Kotlin is same as static keyword in Java. Kotlin does not directly support static keyword.
                   Belongs to the class rather than the instance. Can also be accessed by methods with-in the class*/
}
fun display(parameterVar: Int)
{
var localVar = 150 //this is accessible with-in this function only.
println("Parameter Variable: $parameterVar")
println("Local Variable: $localVar")
println("Instance Variable: $instanceVar")
println("Static Variable: $staticVar")
if (localVar > 0)
{
var blockVar = 200 //this is accessible with-in this block only.
println("Block Variable: $blockVar")
}
}
}

fun main() {
val object1 = ScopeOfVariables()
object1.display(100)
println("\nAfter Changing Instance and Static Variables\n")
object1.instanceVar = 20
ScopeOfVariables.staticVar = 60 /*static variables of a class can be accessed without the instance of the class or the object*/
object1.display(110)
}