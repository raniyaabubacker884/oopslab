import java.util.*;
class employee{
int eNo;
String eName;
double eSalary;
employee(int eNo,String eName,double eSalary)
{
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
}
class emp
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
employee[]emps=new employee[n];
for(int i=0;i<n;i++){
System.out.println("enter eNo:");
int eNo=sc.nextInt();
sc.nextLine();
System.out.println("enter eName:");
String eName=sc.nextLine();
System.out.println("enter Salary:");
double eSalary=sc.nextDouble();
emps[i]=new employee(eNo,eName,eSalary);
}
System.out.println("enter search value:");
int s=sc.nextInt();
for(int i=0;i<n;i++)
{
if(emps[i].eNo==s){
System.out.println("eNo is:"+emps[i].eNo+"eName:"+emps[i].eName+"eSalary:"+emps[i].eSalary);
}
}
}
}
