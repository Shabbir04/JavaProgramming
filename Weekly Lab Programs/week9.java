import java.io.*;
import java.io.IOException;
class Week9
{
public static void main(String args[])
{ 	try{int d=25/5;
	System.out.println(d);
	}
	catch (NullPointerException e)
	{
	System.out.println(e);
	}
finally
{
System.out.println("I am finally block");
}
System.out.println("Success");
}
}