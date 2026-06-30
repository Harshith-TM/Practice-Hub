////Java program to check if a number is palindrome or not 
//If not reverse the number using While Loop

fun main()
{
var reversed=0

println("Enter a Number: ")
var number = readLine()!!.toInt()
var original = number //Keeping a copy because we'll modify the "number" later

//Reversing the number using while loop
while(number!=0)
{
var digit = number % 10 //Extracting the last digit of the number
reversed = reversed * 10 + digit //Building the reverse number
number = number / 10 //Removing the last digit
}

//Checking condition for Palindrome
if(original==reversed)
{
println("Number is a Palindrome");
println("Original Number: $original");
println("Reversed Number: $reversed");
}else{
println("Original Number: $original");
println("Reversed Number: $reversed");
}
}