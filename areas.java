import java.util.*;
class shapes{
public void area(float radius){
double areas = Math.PI*radius*radius;
System.out.println("Area of circle is:"+areas);
}
public void area(int side){
int areas = side*side;
System.out.println("Area of square is:"+areas);
}
public void area(int length,int breadth){
int areas = length*breadth;
System.out.println("Area of rectangle is:"+areas);
}
}
class areas{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
shapes sh = new shapes();
System.out.println("Enter the choice: 1.Circle, 2.Square, 3.Rectangle\n");
System.out.println("Enter your choice");
int n = sc.nextInt();
switch(n){
case 1: System.out.println("Enter the radius:");
float r = sc.nextFloat();
sh.area(r);
break;
case 2: System.out.println("Enter the sides:");
int s = sc.nextInt();
sh.area(s);
break;
case 3: System.out.println("Enter the length and breadth:");
int l = sc.nextInt();
int b = sc.nextInt();
sh.area(l,b);
break;
default:System.out.println("Invalid Choice:");
}
}
}
