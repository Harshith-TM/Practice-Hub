//Kotlin program for Encapsulation

/*Encapsulation in Kotlin is the object-oriented programming principle of wrapping data (variables) and the code acting on it (methods) together into a single unit, typically a class.
Two primary design rules:
Declare class variables as private to hide them from direct external modification.
Provide public getter and setter methods to safely view and update the data under controlled conditions*/

fun main()
{
val encap = Encapsulation(10,20)

println(encap.getPrivateMember())
println(encap.publicMember)

println("\nBefore changing private member value")
encap.displayValues()

encap.setPrivateMember(15)
println("\nAfter changing private member value")
encap.displayValues()
}
class Encapsulation (private var privateMember: Int, var publicMember: Int)
{
fun getPrivateMember(): Int
{
return privateMember
}
fun setPrivateMember(privateMember: Int)
{
this.privateMember = privateMember
}
public fun displayValues()
{
System.out.println("Class Private Variable value: "+privateMember);
System.out.println("Class Public Variable value: "+publicMember);
}
}