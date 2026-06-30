//Java program for Math class and its methods

import java.lang.Math;
import java.util.Random;

class MathFunctions
{
public static void main(String args[])
{
System.out.println("abs: " + Math.abs(-10)); //Returns absolute value
System.out.println("max: " + Math.max(10,20)); //Returns larger value
System.out.println("min: " + Math.min(10,20)); //Returns smaller value
System.out.println("sqrt: " + Math.sqrt(100)); //Returns square root
System.out.println("cbrt: " + Math.cbrt(1000)); //Returns cube root
System.out.println("pow: " + Math.pow(5,5)); //Raises the first number to the power of second number
System.out.println("exp: " + Math.exp(2)); //Returns e^x
System.out.println("expm1: " + Math.expm1(2)); //Returns e^x-1
System.out.println("log: " + Math.log(10)); //Logarithm base e
System.out.println("log10: " + Math.log10(100)); //Logarithm base 10
System.out.println("ceil: " + Math.ceil(4.2)); //Rounds up to nearest integer
System.out.println("floor: " + Math.floor(4.8)); //Rounds down to nearest integer
System.out.println("round: " + Math.round(4.5)); //Rounds nearest integer
System.out.println("rint: " + Math.rint(4.5)); //Rounds nearest double value
System.out.println("signum: " + Math.signum(-15)); //Return sign of the value(-1,0 or 1)
System.out.println("hypot: " + Math.hypot(4,5)); //Calculates sqrt(x^2+y^2)
System.out.println("PI: " + Math.PI); //Return Mathematical pi value
System.out.println("E: " + Math.E); //Return Mathematical e value
System.out.println("random: " + Math.random()); //Random number between 0.0 - 1.0

Random rand = new Random(); /*Generates pseudo-random numbers using a mathematical alogorithm*/
System.out.println("Random Int value: " + rand.nextInt());
System.out.println("Random Long value: " + rand.nextLong());
System.out.println("Random Float value: " + rand.nextFloat());
System.out.println("Random Double value: " + rand.nextDouble());
System.out.println("Random Boolean value: " + rand.nextBoolean());

}
}