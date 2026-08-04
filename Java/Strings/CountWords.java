//Java program to count number of words in a String

import java.util.Scanner;

class CountWords
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter any sentence");
String sentence = sc.nextLine();
String[] words = sentence.trim().split(" ");
int wordsCount = words.length;
System.out.println("Number of words in the given Sentence is: "+wordsCount);
System.out.println("Words are: ");
for(int i=0;i<wordsCount;i++)
{
System.out.println("> "+words[i]);
}

}
}