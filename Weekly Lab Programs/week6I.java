import java.io.*;
class Week6I
{
public static void main(String args[])
{	int temp=0;
	int arr[]={2,8,6,4,3,9,5,7,1,10};
	int n=10;
	int key=4;
	for(int i=0;i<n;i++)
	{
	if(arr[i]==key)
	{
	temp=1;
	break;
	}
	}
	if(temp==1)
	System.out.println("Value Found ");
	else
	System.out.println("Value Not Found");
}
}