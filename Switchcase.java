import java.io.*;
import java.lang.*;
import java.util.*;

class Switchcase
{
	public static void main(String[]args)
	{
		int r,side,length,breadth;	
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		r=sc.nextInt();
		System.out.println("Enter side");
		side=sc.nextInt();
		System.out.println("Enter length and breadth");
		length=sc.nextInt();
		breadth=sc.nextInt();
		System.out.println("Enter choice");
		i=sc.nextInt();
		System.out.println("1.Area of Circle="+"\n 2.Area of Square="+"\n 3.Area of Rectangle=");
		
		switch(i)
		{
			case 1:
				System.out.println("Area of Circle="+(3.14*r*r));
				break;
			case 2:
				System.out.println("Area of Square="+(side*side));
				break;
			case 3:
				System.out.println("Area of Rectangle="+(length*breadth));		
				break;
			default:
				System.out.println("Wrong choice");
		}
	}
}