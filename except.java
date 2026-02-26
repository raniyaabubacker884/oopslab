import java.io.*;
import java.util.*;
class userException extends Exception
{
public userException(String s)
{
super(s);
}
}
class except{
public static void main(String args[]){
Scanner st= new Scanner(System.in);
String uname,pass;
try{
System.out.println("Enter Username:");
uname=st.nextLine();
System.out.println(uname.length());
if (uname ==""){
throw new userException("no user name");
}
if((uname.length())<8){
throw new userException("Greater than 8 characters");
}
}
catch(userException e){
System.out.println("username error"+"\n"+e.getMessage());
}
try {
System.out.println("Enter the password");
pass=st.nextLine();
if (pass==""){
throw  new userException("invalid password");
}
if(pass.length()>8){
throw new userException(" password should not be greater than 8 characters");
}
}
catch (userException es){
System.out.println("Password Error"+"\n"+es.getMessage());
}
}
}
