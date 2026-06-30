//Java program to print Fibonacci series using for loop

import java.util.Scanner;

class Forloop
{
public static void main (String args[])
{
//Starting two numbers of the Fibonacci Series.
int a=0,b=1;

//Variables for user input and next Fibonacci number.
int n,next;

//Scanner object to read input for user.
Scanner sc = new Scanner(System.in);

//Prompt user to enter number of terms to generate.
System.out.println("Enter number of terms.");
n = sc.nextInt();

/*
Generate Fibonacci series using for loop.
Each time the loop print current term and calculates next term for the series.
*/
System.out.println("Fibonacci Series: ");
for(int i=0;i<n;i++)
{
//To print current element of the Series.
System.out.print(a+" ");

//Calculate the next term.
next = a+b;

//Update variables a & b for next iteration.
a=b;
b=next;
}
}
}