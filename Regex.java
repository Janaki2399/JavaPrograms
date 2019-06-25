import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
public class Regex
{
    public static void main(String[] args)
    {
        int count=0;
        String s="the is the is the.";
        Pattern pattern=Pattern.compile("the");
        Matcher matcher=pattern.matcher(s);
        while(matcher.find())
        {
        count++;
        }
        System.out.println(count);
    }
}

