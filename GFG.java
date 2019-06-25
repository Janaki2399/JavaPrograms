import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int gcd=0;
		while(n!=0)
		{
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int i=1;
	while((i<num1)&&(i<num2))
	{
	    if((i%num1==0)&&(i%num2==0))
	    {
	        gcd =i;
	    }
	    i++;
	}
		System.out.println(gcd);
		}

		
	}
}
