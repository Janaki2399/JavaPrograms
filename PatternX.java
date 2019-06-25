import java.io.*;
import java.util.*;
public class PatternX
{
    public static void main(String args[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        int i;
        
        int len=a.length();
        for(i=0;i<len;i++)
        {
            int j=0;
            System.out.print(a.charAt(i));
            System.out.print("\n");
            while(j<=i)
            {
                System.out.print(" ");
                j++;
            }
        }
    }
}
