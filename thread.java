import java.util.*;
class mtables extends Thread 
{
int n,i;
mtables(int n)
{
this.n=n;
}

public void run()
{
for(i=0;i<=n;i++)
{
System.out.println("5 x"+i+"="+(5*i));
}
}
}
class prime extends Thread
{
int n;
prime(int n) 
{
this.n = n;
} 	
public void run()
{
int countn = 0, x = 0, i = 1;
System.out.println("prime numbers are:");
for(i = 2; i <= n; i++)
{
countn = 0;
for(x = 1; x <= i; x++)
{
if(i % x == 0)
{
countn++;
}
}
if(countn == 2)
{
System.out.println(i);
}
}
}
}

class thread
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int muln,primen;
System.out.println("enter n for multiplication table:");
muln=sc.nextInt();
mtables t1=new mtables(muln);

System.out.println("enter n for prime:");
primen=sc.nextInt();
prime t2=new prime(primen);
t1.start();
t2.start();
}
}
