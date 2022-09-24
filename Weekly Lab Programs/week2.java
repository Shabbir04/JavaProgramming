import java.io.*;
import java.util.*;

class Week2
{
	public static void main(String args[])
{
	System.out.println("Enter a char :");
	Scanner x=new Scanner(System.in);
	char a = x.next().charAt(0);
	if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a ==  'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')
{
	System.out.println("You have entered a Vowel!");
}
	else
{
	System.out.println("You have entered a Consonant!");
}
}
}