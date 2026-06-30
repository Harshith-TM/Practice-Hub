fun main()
{
/*Int to Float/Double
Implicit Casting*/
var number1 = 100
var floatNumber1 = number1.toFloat()
var doubleNumber1 = number1.toDouble()
println("Int to Float,Double")
println("Integer Value: $number1")
println("Float Value: $floatNumber1")
println("Double Value: $doubleNumber1")

/*Float/Double to Int
Explicit Casting*/
var floatNumber2 = 49.99f //suffix "f" is added for float else it will be considered double
var doubleNumber2 = 99.99
var number2 = floatNumber2.toInt()
var number3 = doubleNumber2.toInt()
println("\nFloat,Double to Int")
println("Float Value: $floatNumber2")
println("Float to Integer Value: $number2")
println("Double Value: $doubleNumber2")
println("Double to Integer Value: $number3")

// Upcasting
var animal: Animal = Dog()
animal.fn1()

// Downcasting
var dog = animal as Dog
dog.fn2()

/*Int to String*/
var number4 = 1000
var str1 = number4.toString()
println("\nInt to String")
println("Integer Value: $number4")
println("String to Integer Value: $str1")

//String to Int
var str3 = "250"
var number5 = str3.toInt()
println("\nString to Int")
println("String Value: $str3")
println("String to Integer Value: $number5")
}

/*Base class must be open to allow inheritance*/
open class Animal
{
fun fn1()
{
println("\nAnimal Class")
}
}

class Dog : Animal()
{
fun fn2()
{
println("\nDog Class")
}
}