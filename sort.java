import java.util.*;
class sort
{
public static void main(String args[])
{
int n,i,j;
String temp;
Scanner sc=new Scanner(System.in);
Scanner st=new Scanner(System.in);
System.out.println("enter number of strings:");
n=sc.nextInt();
String[]str=new String[n];
System.out.println("enter the strings:");
for(i=0;i<n;i++){str[i]=st.nextLine();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(str[i].compareTo(str[j])>0)
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println("Sorted strings:");for(i=0;i<n;i++)
{
System.out.println(str[i]);
}
}
}
