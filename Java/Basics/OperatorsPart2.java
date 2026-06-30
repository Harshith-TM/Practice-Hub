//Java Program to implement Unary and Relational Operators

class OperatorsPart2
{
public static void main(String args[])
{

//Unary Operators
int a=10,b;
System.out.println("Unary Operators"); //These are called unary operators because it is used on single or one operand.
System.out.println("Original value of a: " + a);

System.out.println("Unary Plus: " + (+a));
char ch = 'A';
System.out.println("Char converted to Int, value: " + (+ch));

/*Unary Plus does not change anything. The variable simply stays same i.e., varA = +a; is same as varA = a;.
But when unary plus operator is used on types smaller than Int it is converted to Int type.
Since Characters in Java is stored as ASCII Values, for character A it's corresponding ASCII Value is returned i.e., 65 .*/

System.out.println("Unary Minus: " + (-a));
/*Unary Minus changes the sign of the variable. So plus becomes minus and minus becomes plus.
i.e., if a = 10. (-a) will make it "-10". if a = -10. (-a) will make it "10".*/

b = ++a;
System.out.println("Pre Increment, a= " + a + " b= " +b); 
/*Pre Increment increases the variable value by 1 before using it.
  first a becomes 11 later it is assigned to b
  Note: increment value need not to be always 1 we can changed with the required value using short-hand operator. EX: a+=2(a=a+2) this will increment the value by 2.*/

b = a++;
System.out.println("Post Increment, a= " + a + " b= " +b);
/*Post Increment increases the variable value by 1 after using it.
  first a is assigned to b later a becomes 12. so b value will still be 11*/

b = --a;
System.out.println("Pre Decrement, a= " + a + " b= " +b);
/*Pre Decrement decreases the variable value by 1 before using it.
  first a becomes 11 later it is assigned to b
  Note: decrement value need not to be always 1 we can changed with the required value using short-hand operator. EX: a-=2(a=a-2) this will decrement the value by 2.*/

b = a--;
System.out.println("Post Decrement, a= " + a + " b= " +b);
/*Post Decrement decreases the variable value by 1 after using it.
  first a is assigned to b later a becomes 10. so b value will still be 11*/

boolean flag = true;
System.out.println("Logical Not: " + !flag);
/*Logical Not can also be called Unary Operator because it works on only single operand.
  Logical Not accepts and return Boolean value only. So if value is true Logical Not makes it false, if false it makes it true*/

//Relational Operators
//Relational Operators returns only Boolean value
int num1 = 20, num2 = 30;

System.out.println("\nRelational Operators");
System.out.println("num1 == num2: " + (num1 == num2));
/*Equal-To Checks if two variables are equal or not. returns true if both are same, if not returns false.
  equal-to operator(==) in not same as assignment operator(=). == checks if two variables are same or not, = assigns value of right hand operator to left hand operator.*/

System.out.println("num1 != num2: " + (num1 != num2));
/*Not-Equal-To Checks if two variables are not equal or equal. returns true if both are not same, if both are same returns false. it is the opposite of equal-to operator*/

System.out.println("num1 > num2: " + (num1 > num2));
/*Greater Than Checks if RHS greater than LHS. returns true if RHS is greater than LHS, if not returns false.*/

System.out.println("num1 < num2: " + (num1 < num2));
/*Lesser Than Checks if RHS lesser than LHS. returns true if RHS is less than LHS, if not returns false.*/

System.out.println("num1 >= num2: " + (num1 >= num2));
/*Greater Than or Equal To Checks if RHS greater than or equal to LHS. returns true if RHS is greater than or equal to LHS, if not returns false.*/

System.out.println("num1 <= num2: " + (num1 <= num2));
/*Lesser Than or Equal To Checks if RHS lesser than or equal to LHS. returns true if RHS is less than or equal to LHS, if not returns false.*/

}
}