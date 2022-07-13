import java .util.Scanner;
class Perfect{
public static void main(String args[])
{
int sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number to check number is perfect or not: ");
int a =sc.nextInt();
for(int i=1;i<a;i++)
{
if(a%i==0)
{
sum=sum+i;
}
}
if (sum==a){
System.out.println(a+"is a perfect number");
}
else
{
System.out.println(a+" is not a perfect number");
}
}
}