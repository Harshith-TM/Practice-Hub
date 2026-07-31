//Java program for Encapsulation

/*Encapsulation in Java is the object-oriented programming principle of wrapping data (variables) and the code acting on it (methods) together into a single unit, typically a class.
Two primary design rules:
Declare class variables as private to hide them from direct external modification.
Provide public getter and setter methods to safely view and update the data under controlled conditions*/

class OopsEncapsulation
{
public static void main(String args[])
{
Encapsulation encap = new Encapsulation(10,20);
        
/*System.out.println(encap.privateMember); this causes a error because the variable is encapsulated, it can be accessed using getter and setter methods */
System.out.println(encap.getPrivateMember());
System.out.println(encap.publicMember);
        
System.out.println("\nBefore changing private member value");
encap.displayValues();
/*encap.privateMember = 15; this causes a error because the variable is encapsulated, it can be accessed using getter and setter methods */
encap.setPrivateMember(15);
System.out.println("\nAfter changing private member value");
encap.displayValues();
}
}
class Encapsulation
{
private int privateMember;
int publicMember;
public Encapsulation(int privateMember,int publicMember)
{
this.privateMember = privateMember;
this.publicMember = publicMember;
}
public int getPrivateMember()
{
return privateMember;
}
public void setPrivateMember(int privateMember)
{
this.privateMember = privateMember;
}
public void displayValues()
{
System.out.println("Class Private Variable value: "+privateMember);
System.out.println("Class Public Variable value: "+publicMember);
}
}