 import java.io.*;
import java.lang.*;
import java.util.*;

class Armstrong
{
	public static void main(String[]args)
	{
		int n,rem=0,sum=0,n1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for n:");
		n=sc.nextInt();
		n1=n;

		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;		
		}
		if(n1==sum)
		{
			System.out.println("Given No is Armstrong ");
		}
		else
		{
			System.out.println("Given No is Not Armstrong ");
		}

	}
}