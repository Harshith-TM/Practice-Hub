//Kotlin program for Logical and Bitwise Operators
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


fun main()
{
var a = true
var b = false
var c = true
var d = false

println("Logical Operators\n")
println("Logical AND")
println("a&&b : ${a && b}")
println("a&&c : ${a && c}")
println("b&&d : ${b && d}")
println("\nLogical OR")
println("a||b : ${a || b}")
println("a||c : ${a || c}")
println("b||d : ${b || d}")
println("\nLogical NOT")
println("!a : ${!a}")
println("!b : ${!b}");

var num1 = 5 //Binary Value: 0101
var num2 = 3 //Binary Value: 0011
println("Bitwise Operators\n")
println("Bitwise AND, num1 and num2: ${num1 and num2}") //Performs AND operation in bit level. 0101 & 0011 = 0001 = 1
println("Bitwise OR, num1 or num2: ${num1 or num2}") //Performs OR operation in bit level. 0101 & 0011 = 0111 = 7
println("Bitwise XOR, num1 xor num2: ${num1 xor num2}") //Performs XOR operation in bit level. 0101 & 0011 = 0110 = 6
println("Complement/inversion, inverse of num1: ${num1.inv()}") //Flips Bits, 0->1, 1->0[complemet operator does not flip visible bits it flips all 32 bits]. 5 becomes -6
println("Left Shift, num1: ${num1 shl 1}") //Shifts bits towards left by given number of bits. Here 1 bit towards left. 0101 = 1010 = 10
println("Right Shift, num1: ${num1 shr 1}") //Shifts bits towards right by given number of bits. Here 1 bit towards right. 0101 = 0010 = 2
println("Unsigned Right Shift, num1: ${num1 ushr 1}") //Shifts bits towards right by given number of bits. Here 1 bit towards right. 0101 = 0010 = 2
/*[Note: Right shift is signed so while filling bits from left it fils 1->negative numbers, 0->positive numbers.
         Unsigned Right Shiift always fills left bits with 0]*/

}