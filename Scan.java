import java.util.Scanner;
class Scan{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your first value= ");
int a=sc.nextInt();
System.out.print("Enter your second value= ");
int b=sc.nextInt();
int c=a+b;
System.out.println(a+"+"+b+"="+c);
}
}