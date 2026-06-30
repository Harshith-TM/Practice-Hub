//Java program for Logical and Bitwise Operators
/*
AND Operator
| operator1 | operator2 | output |
|   false   |   false   | false  |
|   false   |   true    | false  |
|   true    |   false   | false  |
|   true    |   true    | true   |

OR Operator
| operator1 | operator2 | output |
|   false   |   false   | false  |
|   false   |   true    | true   |
|   true    |   false   | true   |
|   true    |   true    | true   |

NOT Operator
|   value   | output |
|   false   | true   |
|   true    | false  |

XOR Operator
| operator1 | operator2 | output |
|   false   |   false   | false  |
|   false   |   true    | true   |
|   true    |   false   | true   |
|   true    |   true    | false  |
*/


class OperatorsPart3
{
public static void main(String args[])
{
boolean a = true , b = false , c = true , d = false;

System.out.println("Logical Operators\n");
System.out.println("Logical AND");
System.out.println("a&&b : " + (a && b));
System.out.println("a&&c : " + (a && c));
System.out.println("b&&d : " + (b && d));
System.out.println("\nLogical OR");
System.out.println("a||b : " + (a || b));
System.out.println("a||c : " + (a || c));
System.out.println("b||d : " + (b || d));
System.out.println("\nLogical NOT");
System.out.println("!a : " + (!a));
System.out.println("!b : " + (!b));

int num1 = 5; //Binary Value: 0101
int num2 = 3; //Binary Value: 0011
System.out.println("Bitwise Operators\n");
System.out.println("Bitwise AND, num1&num2: " +(num1 & num2)); //Performs AND operation in bit level. 0101 & 0011 = 0001 = 1
System.out.println("Bitwise OR, num1|num2: " +(num1 | num2)); //Performs OR operation in bit level. 0101 & 0011 = 0111 = 7
System.out.println("Bitwise XOR, num1^num2: " +(num1 ^ num2)); //Performs XOR operation in bit level. 0101 & 0011 = 0110 = 6
System.out.println("Bitwise Complement, ~num1: " +(~num1)); //Flips Bits, 0->1, 1->0[complemet operator does not flip visible bits it flips all 32 bits]. 5 becomes -6
System.out.println("Bitwise Left Shift, num1<<1: " +(num1 << 1)); //Shifts bits towards left by given number of bits. Here 1 bit towards left. 0101 = 1010 = 10
System.out.println("Bitwise Right Shift, num1>>1: " +(num1 >> 1)); //Shifts bits towards right by given number of bits. Here 1 bit towards right. 0101 = 0010 = 2
System.out.println("Bitwise Unsigned Right Shift, num1>>>1: " +(num1 >>> 1)); //Shifts bits towards right by given number of bits. Here 1 bit towards right. 0101 = 0010 = 2
/*[Note: Right shift is signed so while filling bits from left it fils 1->negative numbers, 0->positive numbers.
         Unsigned Right Shiift always fills left bits with 0]*/
}
}