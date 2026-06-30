//Kotlin program on stringbuilder

fun main()
{
//Ways to create string builder
val sb1 = StringBuilder("Kotlin")
val c: CharSequence = "Kotlin Code"
val sb2 = StringBuilder(c)
val sb3 = StringBuilder(10)
val sb4 = StringBuilder() //Stringbuilder default capacity is 16 characters

//capacity of the string builder
println("sb1 capacity: ${sb1.capacity()}")
println("sb2 capacity: ${sb2.capacity()}")
println("sb3 capacity: ${sb3.capacity()}")
println("sb4 capacity: ${sb4.capacity()}")

//appending to a string builder
sb1.append(" Programming")
println("After Append: $sb1") //append always adds characters at the end of the builder

//inserting to a string builder
sb1.insert(7,"Language ")
println("After Insert: $sb1") //inserts characters at the specified index

//replacing characters in a string builder
sb1.replace(0,6,"Java")
println("After Replace: $sb1") //inserts characters at the specified index

//deleting characters in a string builder
sb1.delete(13,27);
println("After Delete: $sb1") //inserts characters at the specified index

//reversing a string builder
sb1.reverse()
println("After Reverse: $sb1") //reverses the characters in string builder

}