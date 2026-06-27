//Kotlin program to check if two strings are anagrams or not

/*An anagram is a word formed by rearranging the letters of another word, typically using all original letters exactly once. Ex: "listen","silent"*/

fun main()
{
println("Enter First String")
var firstString = readln()

println("Enter Second String")
var secondString = readln()

var charArray1 = firstString.toCharArray()
var charArray2 = secondString.toCharArray()

charArray1.sort()
charArray2.sort()

if(charArray1.contentEquals(charArray2))
{
println("Strings are Anagrams")
}
else
{
println("Strings are not Anagrams")
}

}