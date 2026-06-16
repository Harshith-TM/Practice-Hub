//Java Packages

/*A package is a namespace that organizes related classes, interfaces, enums, and sub-packages.
>Packages help avoid naming conflicts and improve code organization
Types:
1.Built-in: These are packages provided by Java as part of the Java Standard Library
   Examples:
    >java.lang – Contains fundamental classes like String, Math, System
    >java.util – Contains utility classes like ArrayList, HashMap, Scanner
    >java.io – Supports input and output operations
2.User-defined: These are packages created by programmers to organize their own classes and interfaces
   To create a Package use the "package" keyword at the top of a Java file
   To use the package we use "import" keyword along with package name with its complete path if it is in different place
*/

package package1;

import java.util.Scanner;

public class class1
{
String class1Variable = "Class1 Variable from Package1";

public void class1Method()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String username = sc.nextLine();
System.out.println("Hi "+username+"\nThis is "+class1Variable);
}

}

/*
Access Modifiers and Packages

  | Modifier    | Same Class | Same Package | Subclass | Other Packages |
  | ----------- | ---------- | ------------ | -------- | -------------- |
  |private      | Y          | N            | N        | N              |
  |default      | Y          | Y            | N        | N              |
  |protected    | Y          | Y            | Y        | N              |
  |public       | Y          | Y            | Y        | Y              |

*/