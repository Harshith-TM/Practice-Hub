//Java program to check if two strings are anagrams or not

/*An anagram is a word formed by rearranging the letters of another word, typically using all original letters exactly once. Ex: "listen","silent"*/

import java.util.Arrays;
import java.util.Scanner;

class AnagramStrings
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter First String");
String firstString = sc.nextLine();

System.out.println("Enter Second String");
String secondString = sc.nextLine();

char[] charArray1 = firstString.toCharArray();
char[] charArray2 = secondString.toCharArray();

Arrays.sort(charArray1);
Arrays.sort(charArray2);

if(Arrays.equals(charArray1,charArray2))
{
System.out.println("Strings are Anagrams");
}
else
{
System.out.println("Strings are not Anagrams");
}

}
}