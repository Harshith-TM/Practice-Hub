//Java program implementing simple calculator using switch case

import java.util.Scanner;

class ConditionalSwtich
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double num1,num2;
int choice;

System.out.println("Enter First Number"); //Prompt user to enter first number
num1 = sc.nextDouble();

System.out.println("Enter Second Number"); //Prompt user to enter second number
num2 = sc.nextDouble();

//Display menu options
System.out.println("Choose operation");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");

choice = sc.nextInt(); //Read user's choice 

switch(choice)
{
//Addition
case 1:
System.out.println("Sum: "+(num1 + num2));
break;
//Subtraction
case 2:
System.out.println("Differnce: "+(num1 - num2));
break;
//Multiplication
case 3:
System.out.println("Product: "+(num1 * num2));
break;
//Division
case 4:
if(num2!=0){
System.out.println("Division: "+(num1 / num2));
}else{
System.out.println("Cannot divide by zero");
}
break;
default:
System.out.println("Invalid Choice");
}

}
}