//Kotlin Packages

/*A package is a namespace that organizes related classes, interfaces, enums, and sub-packages.
>Packages help avoid naming conflicts and improve code organization
Types:
1.Built-in: These are packages provided by Java as part of the Java Standard Library
   Examples:
    >kotlin - Core language classes and functions (String, Int, etc.)
    >kotlin.collections - Collection types like List, Set, Map
    >kotlin.io - Input/output utilities (println, file operations)
2.User-defined: These are packages created by programmers to organize their own classes and interfaces
   To create a Package use the "package" keyword at the top of a Kotlin file
   To use the package we use "import" keyword along with package name with its complete path if it is in different place
*/

package package1

import kotlin.io.readln

public class class1
{
val class1Variable = "Class1 Variable from Package1"

public fun class1Method()
{
println("Enter your name")
val username = readln()
println("Hi $username \nThis is $class1Variable")
}

}

/*
Access Modifiers and Packages

  | Modifier    | Same Class | Same Package | Subclass | Same Module | Other Modules |
  | ----------- | ---------- | ------------ | -------- | ----------- | -------------- |
  | private     | Y          | N            | N        | N           | N              |
  | protected   | Y          | N            | Y        | N           | N              |
  | internal    | Y          | Y            | Y        | Y           | N              |
  | public      | Y          | Y            | Y        | Y           | Y              |
*/