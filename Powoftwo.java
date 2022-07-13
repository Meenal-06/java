import java.util.Scanner;
class Powoftwo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value: ");
int a= sc.nextInt();
if((a&(a-1))!=0)
{
System.out.println(a+" is not the power of 2");
}
else
{
System.out.println(a+" is the power of 2");
}
}}