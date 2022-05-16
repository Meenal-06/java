class Binarys{
public static void main(String args[])
{
int a[]={10,20,30,40,50,60,70,80,90};
int mid,high=a.length-1,low=0,n=80;
boolean f=false;
while(low<=high)
{
mid=(low+high)/2;
if(a[mid]==n)
{
f=true;
break;
}
else if(n>a[mid])
{
low=mid+1;
}
else
{
high=mid-1;
}
}
if(f)
System.out.println("Element found ");
else
System.out.println("Element not found ");
}
}