import java.io.*;
import java.lang.*;
import java.util.*;

class PrimeNumbers
{
	public static void main(String[]args)
	{
		int i,n;
		boolean flag=false;
		
		for(n=1;n<=100;n++)
		{
			flag=false;
			
			for( i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=true;
					break;
				}
			
			}
			if(flag==false)
			{
				System.out.println(n);	
			}
				
	
		}


	}
}