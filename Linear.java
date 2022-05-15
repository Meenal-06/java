class Linear{
public static void main(String args[])
{
int a[]={50,30,20,10,90,40,80,70};
int n=80, i;
boolean f=false;
for(i=0;i<a.length;i++)
{
if(a[i]==n)
{
f=true;
break;
}
}
if(f)
{
System.out.print("Element Found at index = "+i);
}
else
{
System.out.print("Element not Found");
}
}
}