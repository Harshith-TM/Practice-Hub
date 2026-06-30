//Kotlin program implementing simple number guessing game using do while loop

import kotlin.random.Random

fun main()
{
var number = Random.nextInt(10)+1 /*In-built kotlin class used to generate random number between 1-10*/

var guess:Int // Variable for user input number

//Loop until user guesses the correct number
do
{
println("Guess a number between (1-10): "); //Prompt user to enter a number
guess = readLine()!!.nextInt()

if(guess>number){
println("Too High!");
} else if(guess<number){
println("Too Low!");
} else{
println("Correct Guess");
println("Number is: "+number);
}
}while(guess!=number);

}