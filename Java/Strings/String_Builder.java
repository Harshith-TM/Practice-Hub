//Java program on stringbuilder

import java.lang.StringBuilder;

class String_Builder
{
public static void main(String args[])
{
//Ways to create string builder
StringBuilder sb1 = new StringBuilder("Java");
CharSequence c = "Java Code";
StringBuilder sb2 = new StringBuilder(c);
StringBuilder sb3 = new StringBuilder(10);
StringBuilder sb4 = new StringBuilder(); //Stringbuilder default capacity is 16 characters

//capacity of the string builder
System.out.println("sb1 capacity: "+sb1.capacity());
System.out.println("sb2 capacity: "+sb2.capacity());
System.out.println("sb3 capacity: "+sb3.capacity());
System.out.println("sb4 capacity: "+sb4.capacity());

//appending to a string builder
sb1.append(" Programming");
System.out.println("After Append: "+sb1); //append always adds characters at the end of the builder

//inserting to a string builder
sb1.insert(5,"Language ");
System.out.println("After Insert: "+sb1); //inserts characters at the specified index

//replacing characters in a string builder
sb1.replace(0,4,"Kotlin");
System.out.println("After Replace: "+sb1); //inserts characters at the specified index

//deleting characters in a string builder
sb1.delete(15,27);
System.out.println("After Delete: "+sb1); //inserts characters at the specified index

//reversing a string builder
sb1.reverse();
System.out.println("After Reverse: "+sb1); //reverses the characters in string builder

}
}