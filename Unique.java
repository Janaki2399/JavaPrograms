import java.io.*;
import java.util.*;
public class Unique
{
    public static void main(String[] args)
    {
        int flag=0;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length()-1;i++)
        {
            char b= a.charAt(i);
            for(int j=i+1;j<a.length()-1;j++)
            {
                char c=a.charAt(j);
                if(b==c)

                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                break;}
        }
        if(flag==0)
        {
            System.out.println(" unique");
        }
        else
        {
            System.out.println("not unique");
        }
}
}

