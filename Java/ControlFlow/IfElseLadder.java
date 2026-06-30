//Java program to display Grade using if-else ladder

import java.util.Scanner;

class IfElseLadder
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int marks;

System.out.println("Enter Your Marks:"); //Ask user to enter marks
marks = sc.nextInt();

//if-else ladder to calculate grade
if(marks >= 90){
System.out.println("Grade: A+");
}else if(marks >= 80){
System.out.println("Grade: A");
}else if(marks >= 70){
System.out.println("Grade: B");
}else if(marks >= 60){
System.out.println("Grade: C");
}else if(marks >= 50){
System.out.println("Grade: D");
}else if(marks >= 35){
System.out.println("PASS");
}else{
System.out.println("Better Luck Next Time");
}

}
}