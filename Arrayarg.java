class Arrayarg
{
void add(int a[])
{
int sum=0;
for(int i:a)
sum=sum +i;
System.out.println("Sum of array elements= "+sum);
}
public static void main(String args[])
{
Arrayarg a1 =new Arrayarg();
int A[]={10,20,30,40,50};
int B[]={1,2,3,4,5};
a1.add(A);
a1.add(B);
}
}