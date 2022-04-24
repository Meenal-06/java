class Fibo
{
public static void main(String args[])
{
int a=0,b=1,c,i=1,n=7;
while (i<=n)
{
c=a+b;
System.out.print(a+"\t");
a=b;
b=c;
i++;
}
}
}