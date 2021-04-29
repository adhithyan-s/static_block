//program to find the area of a parallelogram using static block of code

import java.util.*;

public class static_block
{
	static int B,H;
	static boolean flag=true;
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the breadth : ");
		B=sc.nextInt();
		System.out.println("Enter the height : ");
		H=sc.nextInt();
		if(B<=0 || H<=0)
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag=false;
		}
		else flag=true;
	}
	
	public static void main(String[] args)
	{
		if(flag)
		{
			int area=B*H;
			System.out.println("Area : "+area);
		}
	}
}
