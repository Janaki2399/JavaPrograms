import java.io.*;
import java.util.Arrays;
public class TwoStringPermutation
{
    public static void main(String[] args)
    {
    String a="abcd";
    String b="dcab";
    char[] A=a.toCharArray();
    char[] B=a.toCharArray();

    Arrays.sort(A);
    Arrays.sort(B);

    String A1=new String(A);
    String B1=new String(B);
    System.out.println(A1);
    System.out.println(B1);
    if(A1.equals(B1))
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("no");
        }
}
}
