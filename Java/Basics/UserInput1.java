//Java program to take user input

/*Scanner is a class in java.util used to read input from the user.
 Input type - Code
 >Keyboard - new Scanner(System.in)
 >String - new Scanner("text")
 >File - new Scanner(new File("file.txt"))
 >Stream - new Scanner(InputStream)
*/

import java.util.Scanner;

class UserInput1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter Your Name");
String name = sc.nextLine(); //sc.next() for single word

System.out.println("Enter any Number");
int number = sc.nextInt(); //nextLong(); for long data type

System.out.println("Enter Your Weight");
Double weight = sc.nextDouble(); // nextFloat(); for float type

System.out.println("Enter Your Height");
Double height = sc.nextDouble();

System.out.println("Is your age above 18 years [enter true or false]");
boolean age = sc.nextBoolean();

System.out.println("\n--Entered Details--");
System.out.println("Name: "+name);
System.out.println("Random Number: "+number);
System.out.println("Weight: "+weight);
System.out.println("Height: "+height);
System.out.println("Above 18 Years: "+age);
}
}