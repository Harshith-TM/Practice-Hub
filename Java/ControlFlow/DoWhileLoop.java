//Java program implementing simple number guessing game using do while loop

import java.util.Scanner;
import java.util.Random;

class DoWhileLoop
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Random rand = new Random(); //In-built java Class used to generate random number

int number = rand.nextInt(10)+1; //Random number between 1-10
int guess; // Variable for user input number

//Loop until user guesses the correct number
do
{
System.out.println("Guess a number between (1-10): "); //Prompt user to enter a number
guess = sc.nextInt();

if(guess>number){
System.out.println("Too High!");
} else if(guess<number){
System.out.println("Too Low!");
} else{
System.out.println("Correct Guess");
System.out.println("Number is: "+number);
}
}while(guess!=number);

}
}