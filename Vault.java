import java.io.*;
import java.util.*;
class Vault
{
    public static void main(String[] args)
    {
    System.out.println("enter the number");
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> array=new ArrayList();

    int digit;
    int i=0;
    int number=sc.nextInt();
    while(number!=0)
    {
        digit=number%10;
        array.add(digit);
        number=number/10;
        i++;
    }
    int length=array.size();
    for(int j=0;j<length;j++)
    {
        System.out.println(array.get(j));
    }
    Collections.reverse(array);
  for(int j=0;j<length;j++)
    {
        System.out.println(array.get(j));
    }
        }
}

