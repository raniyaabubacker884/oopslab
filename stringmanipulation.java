import java.io.*;
import java.util.*;
class stringmanipulation
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
String a,b,c;
System.out.print("Enter a string:");
a=s.next();
System.out.print("Enter another string:");
b=s.next();
c=a+b;
System.out.println("Length of 1st String: " + a.length());
System.out.println("Length of 2nd String:" + b.length());
System.out.println("Concatenate of Strings: " + c);
System.out.println("Character at position 5 of "+c+":"+c.charAt(5));
System.out.println("Comparison of Strings: " + a.compareTo(b));
System.out.println("last Index of 's' is:"+ c.lastIndexOf('s'));
System.out.println("Endswith character 'r':"+c.endsWith("r"));
System.out.println("Conversion to Uppercase: "+c.toUpperCase());
System.out.println("Conversion to lowercase: "+ c.toLowerCase());
s.close();
}
}
