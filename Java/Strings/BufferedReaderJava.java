//Java bufferedreader

/*BufferedReader is a class used to read text efficiently from a character-input stream by buffering characters. It is commonly used to read data from files, console input, or network streams
A character buffer is a predefined region of computer memory used to temporarily hold text or data while it is being transferred or processed. It acts as a bridge so systems with different processing speeds can communicate smoothly without losing information*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BufferedReaderJava
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*ready() checks whether input is avaliable to use or not. mostly used while reading from a file*/
if(br.ready())
{
System.out.println("Input Available\n");
}
else
{
System.out.println("No Input Available Yet\n");
}

System.out.println("Enter a name");
String name = br.readLine();
System.out.println("Name: "+name);

System.out.println("Enter a character");
int ch = br.read(); /*returns ASCII/Unicode value of the entered character. Reads only one character*/
System.out.println("ASCII Value: "+ch);
System.out.println("Entered Character: "+(char)ch);

br.close();
}
}


/*
bufferedreader does not have built-in parsing, so we use these methods
int intValue = Integer.parseInt(br.readLine());
long longValue = Long.parseLong(br.readLine());
Float floatValue = Float.parseFloat(br.readLine());
double doubleValue = Double.parseDouble(br.readLine());
boolean booleanValue = Boolean.parseBoolean(br.readLine());
*/