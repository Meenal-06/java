import java.util.Scanner; 
class Exception
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System .out .println("Enter the value of a");
int a= sc.nextInt();
System.out.println("Enter the value of b");
int b= sc.nextInt();
try {
int c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
//System.out.println(e);//java.lang.ArithmaticException:/by zero
System.out.println("Don't divided by zero");
}
System.out.println("Bye");
}
}
