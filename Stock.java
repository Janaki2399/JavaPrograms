import java.util.*;
import java.lang.*;
import java.io.*;

class Stock {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int i;
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(i=0;i<n;i++)
		    {
		     a[i]=sc.nextInt();
		    }
		    int end= stock(a,0,n);
		    while(end!=n-1)
		    {
		        int next=end+1;
		       end =stock(a,next,n);
		    }
		  
		    t--;
		}
	}

	 static int  stock(int[] a,int m,int n)
	{
        int en;
        int j;
	    int start;
	    if((m)!=(n-1))
        {
	        if(a[m]<a[m+1])
	        {
            
	        start=m;
	        
	    }
	    else
	    {
	        start=m+1;
	    }
	     j=start;
         if(j!=n-1)
         {
	    while(a[j]<a[j+1])
	    {
            if(j+1==n-1)
            {
                j++;
                break;
            }
            

	        j++;
	    }
         
                en=j;
         if(en==start)
            {
                return en+1;
            }
            else
            {
	    System.out.print("("+start+","+en+")"+" ");
            }
	    return en;
         }
         else
         {
             return n-1;
         }
        }
        else
        {
        return n-1;
        }
	}
}
