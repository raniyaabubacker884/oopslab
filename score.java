import java.io.*;
import java.util.*;
class Student
{
String name="jerin";
String batch="mca";
}
class Sports extends Student{
String Sports="cricket";
}
class result extends Sports{
String result="win";
void display()
{
System.out.println("Student name:"+name);
System.out.println("Student class:"+batch);
System.out.println("Student participated in:"+Sports);
System.out.println("Sports result:"+result);
}
}
class score
{
public static void main(String args[])
{
result r=new result();
r.display();
}
}
