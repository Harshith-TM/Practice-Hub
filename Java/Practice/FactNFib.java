// Java practice program

import java.util.Scanner;

class FactNFib
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
MathUtils mathutils = new MathUtils();
int number;
System.out.println("Enter a Number");
number=sc.nextInt();
mathutils.factorial(number);
mathutils.fibonacci(number);
}
}

class MathUtils
{

void factorial(int number)
{
int factNumber=1;
if(number<0)
{
System.out.println("For Factorial, Number should be greater than 0");
}
else
{
for(int i=1;i<=number;i++)
{
factNumber*=i;
}
System.out.println("Factorial of number "+number+" is: "+factNumber);
}
}

void fibonacci(int number)
{
int fibNumber=0,temp1=0,temp2=1;
if(number<0)
{
System.out.println("For Fibonacci, Number should be greater than 0");
}
else
{
System.out.print("Fibonacci Series for "+number+" is: ");
for(int i=0;i<=number;i++)
{
System.out.print(fibNumber+" ");
temp1=fibNumber+temp2;
fibNumber=temp2;
temp2=temp1;
}
}
}

}