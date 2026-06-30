//Kotlin program on Labeled Loops

fun main()
{
println("Basic For Loop")
for(i in 1..3)
{
for(j in 1..3)
{
println("i: $i, j: $j")
}
}
println("Loop Ended\n")

println("Unlabeled For Loop")
for(i in 1..3)
{
for(j in 1..3)
{
println("i: $i, j: $j")
if(i==2 && j==2)
{
println("break")
break //breaks only the inner loop
}
}
}
println("Loop Ended\n")

println("labeled For Loop")
outerLoop@ for(i in 1..3)
{
for(j in 1..3)
{
println("i: $i, j: $j")
if(i==2 && j==2)
{
println("break")
break@outerLoop /*Exits both loop as inner loop is inside the outer loop. since outer loop is stopped inner loop also stops.*/
}
}
}
println("Loop Ended\n")
}

/*Note: label can also be used for while and do while loop in same format.*/