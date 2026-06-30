//Kotlin program for Math class and its methods

import kotlin.math.*
import kotlin.random.Random

fun main()
{
println("abs: ${abs(-10)}") //Returns absolute value
println("max: ${max(10,20)}") //Returns larger value
println("min: ${min(10,20)}") //Returns smaller value
println("sqrt: ${sqrt(100.0)}") //Returns square root
println("cbrt: ${cbrt(1000.0)}") //Returns cube root
println("pow: ${2.0.pow(5.0)}") //Raises the first number to the power of second number
println("exp: ${exp(2.0)}") //Returns e^x
println("expm1: ${expm1(2.0)}") //Returns e^x-1
println("log: ${log(10.0,2.0)}") //Logarithm with specified base
println("log10: ${log10(100.0)}") //Logarithm base 10
println("ceil: ${ceil(4.2)}") //Rounds up to nearest integer
println("floor: ${floor(4.8)}") //Rounds down to nearest integer
println("round: ${round(4.5)}") //Rounds nearest integer
println("rint: ${4.7.roundToInt()}") //Rounds nearest double value
println("sign: ${sign(-15.0)}") //Return sign of the value(-1,0 or 1)
println("hypot: ${hypot(4.0,5.0)}") //Calculates sqrt(x^2+y^2)
println("PI: ${PI}") //Return Mathematical pi value
println("E: ${E}") //Return Mathematical e value

/*kotlin.random.Random is a abstract class that Generates pseudo-random numbers using a mathematical alogorithm*/
println("Random Int value: ${Random.nextInt()}")
println("Random Long value: ${Random.nextLong()}")
println("Random Float value: ${Random.nextFloat()}")
println("Random Double value: ${Random.nextDouble()}")
println("Random Boolean value: ${Random.nextBoolean()}")

}