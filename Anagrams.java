import java.util.*;
import java.io.*;

public class Anagrams {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        a=a.toLowerCase();
        b=b.toLowerCase();
        HashMap<Character,Integer> map1= new HashMap<>();
          HashMap<Character,Integer> map2= new HashMap<>();
        
          for(int i=0;i<a.length();i++)
          {
              int count=0;
              char k=a.charAt(i);
              System.out.println(k);
              if(!map1.containsKey(k))
              {
                    map1.put(k,1);
              }
              else
              {
                  int freq=map1.get(k);
              map1.put(k,++freq);
              }
          }
          System.out.println(map1);
        for(int i=0;i<b.length();i++)
          {
              int count=0;
              char k=b.charAt(i);
              System.out.println(k);
              if(!map2.containsKey(k))
              {
                    map2.put(k,1);
              }
              else
              {
                  int freq=map2.get(k);
              map2.put(k,++freq);
              }
          }
          System.out.println(map2);
       if(map1.equals(map2))
        {
            System.out.println("anagrams");
        }
        else
        {
            System.out.println("Not anagrams");
        }



        // Complete the function
    }
}
