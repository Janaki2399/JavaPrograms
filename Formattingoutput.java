import java.io.*;
import java.util.*;
public class Formattingoutput
{
    public static void main(String[] argrs)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            String name = sc.next();
            int number=sc.nextInt();
            System.out.printf( "%-15s%03d %n",name,number);
        }
    }
}
