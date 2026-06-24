//Kotlin program to count number of words in a sentence

fun main()
{

println("Enter any sentence")
var sentence = readln()
var words = sentence.trim().split(" ")
var wordsCount = words.size
println("Number of words in the given Sentence is: $wordsCount")
println("Words are: ")
for(word in words)
{
println("> $word")
}

}