//Java program to print triangle pattern with alphabets

class AlphabetsTriangle
{
public static void main(String args[])
{
String[] alphabets = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
int i,j,n=5;

for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(alphabets[j]+" ");
}
System.out.println();
}

}
}