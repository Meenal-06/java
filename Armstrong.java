class Armstrong{
public static void main(String args[])
{
int n= 153,r,sum=0,temp=n;
while(n!=0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(sum==temp)
System.out.print("Given number is armstrong number");
else
System.out.print("Given number is not armstrong number");
}
}