//Kotlin program on strings and string operations

fun main() {
//Creating a string
val str1 = "Kotlin"
val str2 = "Programming"

println("String1 Length: ${str1.length}") //string length
println("String Characters: ${str1[0]}") //accessing string characters
println("String Characters: ${str1[2]}")

println("\nString Concatenation")
println(str1 + str2) //using + operator
println("$str1 $str2")

println("\nString Comparison")
println(str1 == str2) //checks whether two string are equal or not, case sensitive
println(str1.equals(str2, ignoreCase = true)) //checks whether two string are equal or not, case insensitive
println(str1.compareTo(str2)) //compares two strings lexicographically(in dictionary order) based on Unicode value of each character

println("\nString Conversion")
println(str1.uppercase()) //converts string to upper case
println(str1.lowercase()) //converts string to lower case

println("\nCreating a Sub-String")
println(str2.substring(0, 4)) //creates a substring based on starting and end position

println("\nChecking for Sub-String")
println("String1 contains Ko: ${str1.contains("Ko")}") //Returns true or false based on whether the string contains the specified value
println("String1 contains program: ${str1.contains("program")}")
println("String1 starts with K: ${str1.startsWith("K")}") //checks whether the string starts with the given pattern or string
println("String1 starts with n: ${str1.startsWith("n")}")
println("String1 ends with n: ${str1.endsWith("n")}") //checks whether the string starts with the given pattern or string
println("String1 ends with K: ${str1.endsWith("K")}")

val str3 = "I like to play"
println("\nReplacing character or words in String")
println("Before replacing: $str3")
println("After replacing: ${str3.replace("play", "sleep")}") //replaces the words or character with given word or character

val str4 = " Spaces "
println("\nRemoving extra spaces in a String")
println("Before: $str4")
println("After: ${str4.trim()}")

val str5 = "Java,Kotlin,C,C++"
val langs = str5.split(",")
println("\nSplitting a String")
println("Before: $str5")
print("After: ")
for (l in langs) {
print("$l ")
}

println("\n\nFinding index of a character or word")
println("Index of v: ${str1.indexOf('t')}")
}
/*String interpolation in kotlin is the process of embedding variables or expressions directly inside a string using $ or  ${}.Ex: val name = "Goku" println("Hello $name")*/

/*Strings in kotlin are immutable i.e., once a string object is created, its value cannot be changed. So we use stringbuilder when performing string modification as it is more efficient than creating new string objects.*/