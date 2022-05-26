
class Arrayaddmin
{
int add( int a[])
{
int sum=0;
for( int i:a)
{
sum=sum+i;
}
return sum;
}


int min(int a[])
{
int min=a[0];
for(int i=1;i<a.length;i++)
{
if(min>a[i])
{
min=a[i];
}
}
return min;
}


int max(int a[])
{
int max=a[0];
for(int i=1;i<a.length;i++)
{
if(max<a[i])
{
max=a[i];
}
}
return max;
}

void sort(int a[]){
int temp;
for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("Sorted array=");
for(int i:a){
System.out.print (i+"\t");
}
System.out.println();
}


void search(int a[],int n)
{
int i;
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
System.out.println("Element Found at index = "+i);
}
else
{
System.out.println("Element not Found");
}
}

public static void main(String args[])
{
int arr[]={50,40,20,10,30};
System.out.print("Given array= ");
for(int k:arr)
System.out.print(k+"  ");
Arrayaddmin a=new Arrayaddmin();
int x=a.add(arr);
int y=a.min(arr);
int z=a.max(arr);
System.out.println();
System.out.println("Addition of array elments = "+x);
System.out.println("Minimum value in array  = "+y);
System.out.println("Maximum value in array= "+z);
a.search(arr,10);
a.sort(arr);

}
}