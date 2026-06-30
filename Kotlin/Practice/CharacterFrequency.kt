//Kotlin program to check frequency of characters in a string

fun main()
{
println("Enter a String")
var str = readln()
var freq = IntArray(256)
for(i in str.indices)
{
freq[str[i].code]++
}
println("Characters Frequency")
for(i in 0 until 256)
{
if(freq[i]>0)
{
println("${i.toChar()} : ${freq[i]}")
}
}
}