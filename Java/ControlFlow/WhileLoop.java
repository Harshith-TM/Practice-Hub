//Java program to check if a number is palindrome or not 
//If not reverse the number using While Loop

import java.util.Scanner;

class WhileLoop
{
public static void main(String args[])
{
int number,original,reversed=0;
Scanner sc = new Scanner(System.in);

System.out.println("Enter a Number: ");
number = sc.nextInt();
original = number; //Keeping a copy because we'll modify the "number" later

//Reversing the number using while loop
while(number!=0)
{
int digit = number%10; //Extracting the last digit of the number
reversed = reversed*10+digit; //Building the reverse number
number = number/10; //Removing the last digit
}

//Checking condition for Palindrome
if(original==reversed)
{
System.out.println("Number is a Palindrome");
System.out.println("Original Number: "+original);
System.out.println("Reversed Number: "+reversed);
}else{
System.out.println("Original Number: "+original);
System.out.println("Reversed Number: "+reversed);
}

}
}