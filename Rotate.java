import java.util.*;
import java.lang.*;
import java.io.*;

class Rotate {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		while(n!=0)
		{
		    int t=sc.nextInt();
		    int[] a=new int[20];
		    int[] b=new int[20];
		    int i;
		    int j=0;
		    int k=0;
		    int start;
		    int end;
		    for( i=0;i<t;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int nf=sc.nextInt();
		    for(i=0;i<nf;i++)
		    {
		        b[i]=a[i];
		    }
		    for(i=0;i<=nf;i++)
		    {
		        a[i]=a[i+nf];
		        k=i;
		    }
		    for(i=k+1;i<=t;i++)
		    {
		        a[k+1]=b[j];
		        j++;
		    }
		    for(i=0;i<t;i++)
		    {
		        System.out.println(a[i]);
		    }
		    n--;
	}
}
}
