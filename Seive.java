import java.util.*;
import java.lang.*;
import java.io.*;

class Seive {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int m=0;
		int i;
		int j;
		while(n!=0)
		{
		    int num=sc.nextInt();
		    int[] a=new int[num];
		    for(i=2;i<=num;i++)
		    {
		        a[m]=i;
		        m++;
		    }
		    for(i=0;i<m;i++)
		    {
		        for(j=i+1;j<m;j++)
		        {
		            if(a[i]==0)
		            {
		                break;
		            }
		             if(((a[j]!=0)&&((a[j]%a[i]))==0))
		            {
		                a[j]=0;
		            }
		            
		        }
		    }
		    for(i=0;i<m;i++)
		    {
		    if(a[i]!=0)
		    {
		        System.out.println(a[i]);
		    }
		    }
		    n--;
		}
	}
}
