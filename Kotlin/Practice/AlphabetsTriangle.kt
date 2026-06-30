//Kotlin program to print triangle pattern with alphabets

fun main()
{
val alphabets = arrayOf("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
val n=5

for(i in 0 until n)
{
for(j in 0..i)
{
print("${alphabets[j]} ")
}
println()
}

}