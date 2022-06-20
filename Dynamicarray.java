import java.util.Scanner;
class Dynamicarray{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of array");
int n= sc.nextInt();
int a[]=new int[n];
for (int i=0;i<n;i++)
{
//System.out.println("Enter the value at"+(i++)+"postion=");
a[i]=sc.nextInt();
}
System.out.print("You have entered= ");
for(int i:a)
{
System.out.print(i+" ");
}
}}