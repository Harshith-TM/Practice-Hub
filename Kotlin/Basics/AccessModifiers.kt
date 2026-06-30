//Kotlin Access Modifiers

/*
  | Modifier    | Same Class | Same Package | Subclass | Same Module | Other Modules |
  | ----------- | ---------- | ------------ | -------- | ----------- | -------------- |
  | private     | Y          | N            | N        | N           | N              |
  | protected   | Y          | N            | Y        | N           | N              |
  | internal    | Y          | Y            | Y        | Y           | N              |
  | public      | Y          | Y            | Y        | Y           | Y              |
*/

fun main()
{
val e = subEmployee()
println("Public Member -> Name: " + e.name)
println("Protected Member -> Dept: " + e.get_Dept())
println("Internal Member -> Company: " + e.company)
println("Private Member -> Salary: " + e.getSalary())
e.setSalary("120LPA")
println("Private Member after Update -> Salary: " + e.getSalary())
}

open class Employee /*"open" is not a access modifier. By default class in Kotlin is final so the make the class inheritable "open" keyword is used.*/ 
{
private var salary = "60LPA" 

fun setSalary(salary: String) 
{
this.salary = salary
}

fun getSalary(): String
{
return salary
}

protected var dept = "Web Developer" /*Protected: Accessible inside same class and its subclass only.*/

internal var company = "Strak Industries" /*Internal: Accessible in same package and also from other package but not from different module*/

var name = "SpiderMan"
}

class subEmployee : Employee()
{
fun get_Dept(): String
{
return dept
}
}