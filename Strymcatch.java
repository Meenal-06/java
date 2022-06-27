import java.util.Scanner; 
class Strymcatch
{
public static void main(String args[])
{
int d[]={1,2,3};
Scanner sc= new Scanner(System.in);
System .out .println("Enter the value of a");
int a= sc.nextInt();
System.out.println("Enter the value of b");
int b= sc.nextInt();
try {
int c=a/b;
System.out.println(c);
System.out.println(d[3]);
}
catch(ArithmeticException e)
{
//System.out.println(e);//java.lang.ArithmaticException:/by zero
System.out.println("Don't divided by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index of array is invalid");
}

System.out.println("Bye");
}
}
