/*Kotlin program to count number of positive, negative and zero's in a array using for-each loop*/

fun main()
{
//Array with positive, negative and zero values.
var arr = arrayOf(5,15,-2,0,7,-9,4,0,10,-40,0,69,-96,-1,45)

//Count variables to store the count of occurrences each type.
var positive=0; var negative=0;var zero=0

/*
Traversing through each array element using for-each loop.
Each element is checked and its corresponding count variable in updated.
*/

for(num in arr)
{
if(num>0){ //Check for positive numbers.
positive++
} else if(num<0){ //Check for negative numbers.
negative++
} else{ //If the number is neither positive nor negative then its zero.
zero++
}
}
println("Positive Numbers Count: $positive");
println("Negative Numbers Count: $negative");
println("Zero's Count: $zero");
}