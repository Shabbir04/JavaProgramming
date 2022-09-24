import java.io.*;
import java.util.*;

class Week1
{
public static void main(String args[])
{	
	System.out.println("Enter a number : ");
	Scanner x=new Scanner(System.in);
	int a=x.nextInt();
	int c=0;
	while(a!=0)
{	a=a/10;
	c=c+1;
}
	System.out.println("No of digits are :"+c);

}
}