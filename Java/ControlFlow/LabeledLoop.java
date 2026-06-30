//Java program on Labeled Loops

class LabeledLoop
{
public static void main(String args[])
{

System.out.println("Basic For Loop");
for(int i=1;i<=3;i++)
{
for(int j=1;j<=3;j++)
{
System.out.println("i: "+i+", j: "+j); 
}
}
System.out.println("Loop Ended\n");

System.out.println("Unlabeled For Loop");
for(int i=1;i<=3;i++)
{
for(int j=1;j<=3;j++)
{
System.out.println("i: "+i+", j: "+j); 
if(i==2 && j==2)
{
System.out.println("break");
break; /*Exits only the inner loop.*/
}
}
}
System.out.println("Loop Ended\n");

System.out.println("Labeled For Loop");
outerLoop:          //For loop label
for(int i=1;i<=3;i++)
{
for(int j=1;j<=3;j++)
{
System.out.println("i: "+i+", j: "+j); 
if(i==2 && j==2)
{
System.out.println("break");
break outerLoop; /*Exits both loop as inner loop is inside the outer loop. since outer loop is stopped inner loop also stops.*/
}
}
}
System.out.println("Loop Ended");
}
}

/*Note: label can also be used for while and do while loop in same format.*/