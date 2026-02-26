package graphics;
import java.util.*;
interface shape{
double area();
}
class rectangle implements shape{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("enter the length and breadth:");
float l=sc.nextFloat();
float b=sc.nextFloat();
float area=l*b;
return(area);
}
}
class square implements shape{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("enter the side length:");
float s=sc.nextFloat();
float area=s*s;
return(area);
}
}
class circle implements shape{
Scanner sc=new Scanner(System.in);
public double area() {
System.out.println("Enter the radius:");
float r = sc.nextFloat();
double area = 3.14159 * r * r;
return area;
}
}
class triangle implements shape {
Scanner sc = new Scanner(System.in);
public double area() {
System.out.println("Enter the height:");
float h = sc.nextFloat();
System.out.println("Enter the base:");
float b = sc.nextFloat();
double area = 0.5 * h * b;
return area;
}
}
class graphics
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter choice:1.rectangle,2.square,3.triangle,4.circle");
int c=sc.nextInt();
switch(c)
{
case 1:
rectangle re = new rectangle();
System.out.println("Area of rectangle = "+re.area());
break;
case 2:
square sq = new square();
System.out.println("Area of square = "+sq.area());
break;
case 3:
triangle tr = new triangle();
System.out.println("Area of triangle = "+tr.area());
break;
case 4:
circle ci = new circle();
System.out.println("Area of Circle = "+ci.area());
break;
default:
System.out.println("invalid choice.please try again.");
}
}
}
