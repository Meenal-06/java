class Minmax{
public static void main(String args[])
{
int a[]={50,30,20,10,90,40,70};
int min=a[0],max=a[0];
for(int i=1; i<a.length;i++)
{ if (min>a[i])
	{
	min=a[i];
	}
}
System.out.print("Minimum value element in array="+min);
System.out.println();
for(int i=1;i<a.length;i++)
{
if (max<a[i])
	{
	max=a[i];
	}
}
System.out.print("Maximum value element in array="+max);

}
}
