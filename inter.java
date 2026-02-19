import java.io.*;
import java.util.*;
interface shape{
void area();
void perimeter();
}
class circle implements shape{
int r;
Scanner sc = new Scanner(System.in);
public void area(){
System.out.println("Enter the radius:");
int r = sc.nextInt();
double area = Math.PI*r*r;
System.out.println("Area of the circle:"+area);
}
public void perimeter(){
System.out.println("Enter the radius:");
int r = sc.nextInt();
double perimeter = 2*Math.PI*r;
System.out.println("Perimeter of the circle:"+perimeter);
}
}
class rectangle implements shape{
int l;
int b;
Scanner sc = new Scanner(System.in);
public void area()
{
System.out.println("Enter the length:");
int l = sc.nextInt();
System.out.println("Enter the breadth:");
int b = sc.nextInt();
double area=l*b;
System.out.println("Area of rectangle:"+area);
}
public void perimeter(){
System.out.println("Enter the length:");
int l = sc.nextInt();
System.out.println("Enter the breadth:");
int b = sc.nextInt();
double perimeter=2*(l+b);
System.out.println("Perimeter of the rectangle:"+perimeter);
}
}
class inter{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
circle fg = new circle();
rectangle df = new rectangle();
System.out.println("Enter the choice:1.circle,2.rectangle");
int n = sc.nextInt();
switch(n){
case 1:fg.area();
fg.perimeter();
break;
case 2:df.area();
df.perimeter();
break;
default : System.out.println("Invalid choice");
}
}
}

