class Arrayrev{
public static void main(String args[])
{
int a[]={10,20,30,40,50};
int sum=0;
for(int i=a.length-1;i>=0;i--)
{
System.out.print(a[i]+ "\t");
}
System.out.println();
for(int i:a)
{
sum=sum+i;
}
System.out.println("Sum of array elements ="+sum);
}
}
