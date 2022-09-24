import java.io.*;
class Week5In 
{
public static void main(String args[])
{
	int arr[]={5,7,4,2,6,0,1,3,8,10,9};
	int n=11;
	System.out.println("Before Sorting");
	for(int i=0;i<n;i++)
	{
	System.out.println(arr[i]);
	}
	int temp = 0;  
	for(int i=0; i < n; i++)
	{  
        for(int j=1; j < (n-i); j++)
	{  
	if(arr[j-1] > arr[j])
	{  
        temp = arr[j-1];  
	arr[j-1] = arr[j];  
        arr[j] = temp;  
        }  
        }  
	}
	System.out.println("After Sorting");
	for(int i=0;i<n;i++)
	{
	System.out.println(arr[i]);
	}


}
}
