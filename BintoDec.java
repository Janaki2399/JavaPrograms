import java.util.*;
import java.lang.Math;
import java.io.*;

class BintoDec {
	public static void main (String[] args) {
		//code
			int n;
			int total=0;
		Scanner sc=new Scanner(System.in);
		int digit;
    	

	int number;
		n=sc.nextInt();
		while(n!=0)
		{
		   
		    number=sc.nextInt();
		    while(number!=0)
		    {
		    int j=0;
		    int b;
		    digit=number%10;
		    b=(int)(Math.pow(2,j));
		    System.out.println(b);
		    int a=digit*b;
		    System.out.println(a);
		     total=total+a;
		    number=number/10;
		    j++;
		 
		    }
		    System.out.println(total);
		    n--;
		}
	}
}
