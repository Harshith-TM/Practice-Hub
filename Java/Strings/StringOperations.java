//Java program on strings and string operations

class StringOperations
{
public static void main(String args[])
{
//Creating a string
String str1 = "Java"; //using string literal
String str2 = new String("Programming"); //using constructor

System.out.println("String1 Length: "+(str1.length())); //string length
System.out.println("String Characters: "+(str1.charAt(0))); //accessing string characters
System.out.println("String Characters: "+(str1.charAt(2)));

System.out.println("\nString Concatenation");
System.out.println(str1.concat(str2)); //using concat()
System.out.println(str1+" "+str2); //using + operator

System.out.println("\nString Comparison");
System.out.println(str1.equals(str2)); //checks whether two string are equal or not, case sensitive
System.out.println(str1.equalsIgnoreCase(str2)); //checks whether two string are equal or not, case insensitive
System.out.println(str1.compareTo(str2)); //compares two strings lexicographically(in dictionary order) based on Unicode value of each character

System.out.println("\nString Conversion");
System.out.println(str1.toUpperCase()); //converts string to upper case
System.out.println(str1.toLowerCase()); //converts string to lower case

System.out.println("\nCreating a Sub-String");
System.out.println(str2.substring(0,4)); //creates a substring based on starting and end position

System.out.println("\nChecking for Sub-String");
System.out.println("String1 contains Ja: "+(str1.contains("Ja"))); //Returns true or false based on whether the string contains the specified value
System.out.println("String1 contains program: "+(str1.contains("program")));
System.out.println("String1 starts with J: "+(str1.startsWith("J"))); //checks whether the string starts with the given pattern or string
System.out.println("String1 starts with a: "+(str1.startsWith("a")));
System.out.println("String1 ends with a: "+(str1.endsWith("a"))); //checks whether the string starts with the given pattern or string
System.out.println("String1 ends with J: "+(str1.endsWith("J")));

String str3 = "I like to play";
System.out.println("\nReplacing character or words in String");
System.out.println("Before replacing: "+str3);
System.out.println("After replacing: "+(str3.replace("play","sleep"))); //replaces the words or character with given word or character

String str4 = " Spaces ";
System.out.println("\nRemoving extra spaces in a String");
System.out.println("Before: "+str4);
System.out.println("After: "+(str4.trim()));

String str5 = "Java,Kotlin,C,C++";
String[] langs = str5.split(",");
System.out.println("\nSplitting a String");
System.out.println("Before: "+str5);
System.out.print("After: ");
for(String l : langs){
System.out.print(l+" ");
}

System.out.println("\n\nFinding index of a character or word");
System.out.println("Index of v: "+(str1.indexOf('v')));
}
}

/*Strings in java are immutable i.e., once a string object is created, its value cannot be changed. So we use stringbuilder when performing string modification as it is more efficient than creating new string objects.*/