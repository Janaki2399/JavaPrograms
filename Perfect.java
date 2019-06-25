import java.util.*;
import java.lang.*;
import java.io.*;

class Perfect {
	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
		    int num=sc.nextInt();
		   int  N=num;
		int sum=1;
		int flag=0;
	for(int i=2;i<=N/2;i++)
	{
	    for(int j=2;i<=N/2;j++)
	    {
	    if((num%j)==0)
	    {
	        int q=num/j;
	        num=q;
	        sum=sum+j;
	        if(sum==N)
	        {
	            System.out.println("1");
	            flag=1;
	            break;
	        }
	        break;
	    }
	    }
	}
	if(flag==0)
	{
	    System.out.println("0");
	}
	n--;
	}
	}
}
