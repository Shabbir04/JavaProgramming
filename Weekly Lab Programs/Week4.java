import java.io.*;
class Week4
{
public static void main(String args[])
{
	int a=55;
	int b=21; 
	System.out.println("The Value of a is "+a);
	System.out.println("The Value of b is "+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("<-------->After swaping by bitwise operator<-------->");
	System.out.println("The Value of a is "+a);
	System.out.println("The Value of b is "+b);
}
}
