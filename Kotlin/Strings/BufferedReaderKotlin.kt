//Kotlin bufferedreader

/*BufferedReader is a class used to read text efficiently from a character-input stream by buffering characters. It is commonly used to read data from files, console input, or network streams
A character buffer is a predefined region of computer memory used to temporarily hold text or data while it is being transferred or processed. It acts as a bridge so systems with different processing speeds can communicate smoothly without losing information*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

fun main()
{
val br = BufferedReader(InputStreamReader(System.`in`))
/*
Short hand
val br = System.`in`.bufferedReader()
val line = br.readLine()
*/

/*ready() checks whether input is avaliable to use or not. mostly used while reading from a file*/
if(br.ready())
{
println("Input Available\n")
}
else
{
println("No Input Available Yet\n")
}

println("Enter a name")
val name = br.readLine()
println("Name: $name")

println("Enter a character")
val ch = br.read() /*returns ASCII/Unicode value of the entered character. Reads only one character*/
println("ASCII Value: $ch")
println("Entered Character: ${ch.toChar()}")

br.close()
}

/*
val intValue = br.readLine().toInt()
val longValue = br.readLine().toLong()
val floatValue = br.readLine().toFloat()
val doubleValue = br.readLine().toDouble()
val booleanValue = br.readLine().toBoolean()
*/