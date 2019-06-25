/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Missing{
	public static void main (String[] args) {
		//code
				Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		while(n!=0)
		{
		    int t=sc.nextInt();
		    int[] a=new int[t];
		
		    int i;
		    int j=0;
		    int k=0;
		int flag=0;
		    for( i=0;i<t-1;i++)
		    {
		        a[i]=sc.nextInt();
		    }

		    for(i=1;i<=t;i++)
		    {
		       for(j=0;i<t-1;j++)
		       {
		          if(i==a[j])
		          {
		              flag=0;
		              break;
		          }
		          if(i!=a[j])
		          {
		              flag=1;
		          }
		       }
		       if(flag==1)
		       {
		           System.out.println(i);
		           break;
		       }
		    }
		  
		   n--;
		}
	}
}
