//Kotlin program implementing Range, Safe call, Elvis operator

fun main()
{
println("Range Operator")
println("Open range") //Closed range. includes the end value
for(i in 1..5){ println("$i") }
println("\nHalf op range") //Half open range. excludes the end value
for(i in 1..<5){ println("$i") }

var name: String? = null /* ? can be used while declaring variable to give null value [var name: String = null] gives error*/
println("\nSafe call operator")
println(name?.length) /*Safe call is used to call a function or access a variable only if it is not a null value, else it returns null without crashing the program*/
println("\nElvis operator")
println(name ?: "Empty") /*Elvis operator is used to give default value. if the variable or object is not null it returns its original value, if its null it returns the default value*/

println("\n'is' operator") /*'is' operator is used to check whether the object or variable is of particular type or not. same as instanceof in Java*/
var a:Any = 1
if(a is String){
println("Is a String")
} else{
println("Not a String")
}
}