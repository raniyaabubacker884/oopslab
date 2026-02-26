import java.io.*;
import java.util.*;
class negativeNumberException extends Exception{
public negativeNumberException(String s){
super(s);
}
}
class average{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int count ,i;
System.out.println("Please Enter Numbers to be Calculated:");
count = sc.nextInt();
int[]numbers=new int[count];
try{
System.out.println("Please Enter "+count+"numbers:");
for(i=0;i<count;i++){
int num = sc.nextInt();
numbers[i]=num;
if(num<0){
throw new negativeNumberException("Negative Numbers are not allowed");
}
}
int sum=0;
for(i=0;i<count;i++){
sum+=numbers[i];
}
float avg=(float)sum/count;
System.out.println("Average of given numbers is: "+avg);
}
catch(negativeNumberException ex){
System.out.println("Exception Caught!!");
System.out.println(ex.getMessage());
}
}
}
