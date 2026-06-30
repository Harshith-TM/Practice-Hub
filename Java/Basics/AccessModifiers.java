//Java Access Modifiers
/*
  | Modifier    | Same Class | Same Package | Subclass | Other Packages |
  | ----------- | ---------- | ------------ | -------- | -------------- |
  |private      | Y          | N            | N        | N              |
  |default      | Y          | Y            | N        | N              |
  |protected    | Y          | Y            | Y        | N              |
  |public       | Y          | Y            | Y        | Y              |
*/


class Employee
{
private String salary = "60LPA"; //Private: Accessible with-in the class only.

public void setSalary(String salary) /*Setter Method used to change value of private members of the class.*/
{
this.salary = salary;
}

public String getSalary() /*Getter Method used to access private members of the class.*/
{
return salary;
}

String dept = "Web Developer"; /*Default: Accessible inside same package. Members outside package cannot access this including subclass.*/

protected String company = "Strak Industries"; /*Protected: Accessible in same package and subclasses from other package*/

public String name = "SpiderMan"; /*Public: Accessible to All*/
}

class AccessModifiers
{
public static void main(String args[])
{
Employee e = new Employee();
System.out.println("Public Member -> Name: "+e.name);
System.out.println("Default Member -> Dept: "+e.dept);
System.out.println("Protected Member -> Company: "+e.company);
System.out.println("Private Member -> Salary: "+e.getSalary());
e.setSalary("120LPA");
System.out.println("Private Member after Update -> Salary: "+e.getSalary());
}
}