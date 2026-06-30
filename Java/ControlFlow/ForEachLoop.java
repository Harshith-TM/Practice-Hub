/*Java program to count number of positive, negative and zero's in a array using for-each loop*/

class ForEachLoop
{
public static void main(String args[])
{
//Array with positive, negative and zero values.
int[] arr = {5,15,-2,0,7,-9,4,0,10,-40,0,69,-96,-1,45};

//Count variables to store the count of occurrences each type.
int positive=0, negative=0, zero=0;

/*
Traversing through each array element using for-each loop.
Each element is checked and its corresponding count variable in updated.
*/

for(int num:arr)
{
if(num>0){ //Check for positive numbers.
positive++;
} else if(num<0){ //Check for negative numbers.
negative++;
} else{ //If the number is neither positive nor negative then its zero.
zero++;
}
}
System.out.println("Positive Numbers Count: "+positive);
System.out.println("Negative Numbers Count: "+negative);
System.out.println("Zero's Count: "+zero);
}
}