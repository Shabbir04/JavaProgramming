import java.io.*;
class Week5Pl 
{
public static void main(String args[])
{
	int arr[]={5,7,4,2,6,0,1,3,8,10,9};
	int n=11;
	int sum=0;
	for(int i=0;i<n;i++)
	{ sum=sum+arr[i];}
	float avg=(sum/n);
	System.out.println("The Sum is : " + sum);
	System.out.println("The Average is : " + avg);
}
}