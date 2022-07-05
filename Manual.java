import java.util.Scanner;
class Testexception extends ArithmeticException
{
String msg;
Testexception(String str)
{
msg=str;
}
public String toString(){
return "TestException : "+msg;
}
 }
class Manual
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System .out .println("Enter the value of a");
int a= sc.nextInt();
System.out.println("Enter the value of b");
int b= sc.nextInt();
try {
if(b==1)
{
throw new Testexception("/ by one ");
}
else
{
int c=a/b;
System.out.println(c);
}
}
catch(Testexception e)
{
System.out.println(e);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("Bye");
}
}