import java.io.*;
import java.util.*;
class publisher
{
String name="jerin";
}
class book extends publisher
{
String bookname="paulo";
}
class literature extends book
{
String type="literature";
}
class fiction extends book
{
String type="fiction";
}
class library
{
public static void main(String args[])
{
literature ab=new literature();
fiction bc=new fiction();
System.out.println("fiction book details:");
System.out.println("publisher:"+bc.name +"|name is:"+bc.bookname+"|type is:"+bc.type);
System.out.println("literature book details:");
System.out.println("publisher:"+ab.name+"|name is:"+ab.bookname+"|type is:"+ab.type);
}
}
