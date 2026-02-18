import java.io.*;
import java.util.*;
class person
{
String name;
String gender;
String address;
int age;
person(String name,String gender,String address,int age)
{
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class employee extends person
{
int empid;
String companyname;
String qualification;
int salary;
employee(String name,String gender,String address,int age,int empid,String companyname,String qualification,int salary)
{
super(name,gender,address,age);
this.empid=empid;
this.companyname=companyname;
this.qualification=qualification;
this.salary=salary;
}
}
class teacher extends employee
{
String subject;
String department;
int teacherid;
teacher(String name,String gender,String address,int age,int empid,String companyname,String qualification,int salary,String subject,String department,int teacherid)
{
super(name,gender,address,age,empid,companyname,qualification,salary);
this.subject=subject;
this.department=department;
this.teacherid=teacherid;
}
void display()
{
System.out.println("DETAILS\n");
System.out.println("Emp ID:"+empid);
System.out.println("College Name:"+companyname);
System.out.println("Salary:"+salary);
System.out.println("Teacher ID:"+teacherid);
System.out.println("Subject:"+subject);
System.out.println("Department:"+department);
}
}
class pp
{
public static void main(String args[])
{
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter number of teachers(n):");
n=sc.nextInt();
sc.nextLine();
teacher[] te=new teacher[n];
for(i=0;i<n;i++)
{
System.out.println("Enter "+(i+1)+"Teacher details:");
System.out.println("Enter Name:");
String name=sc.nextLine();
System.out.println("Enter Gender:");
String gender = sc.nextLine();
System.out.println("Enter Address:");
String address=sc.nextLine();
System.out.println("Enter age:");
int age =sc.nextInt();
sc.nextLine();
System.out.println("Enter employee ID:");
int empid=sc.nextInt();
sc.nextLine();
System.out.println("Enter college name:");
String companyname=sc.nextLine();
System.out.println("Enter qualification:");
String qualification =sc.nextLine();
System.out.println("Enter salary:");
int salary=sc.nextInt();
sc.nextLine();
System.out.println("Enter subject:");
String subject=sc.nextLine();
System.out.println("Enter Department:");
String department=sc.nextLine();
System.out.println("Enter teacher Id:");
int teacherid=sc.nextInt();
sc.nextLine();
te[i]=new teacher(name,gender,address,age,empid,companyname,qualification,salary,subject,department,teacherid);
}
for(i=0;i<n;i++)
{
te[i].display();
}
sc.close();
}
}
}
