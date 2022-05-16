class Copy{
int a,b,c;
Copy(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
Copy(Copy c1)
{
a=c1.a;
b=c1.b;
c=c1.c;
}
void show()
{
System.out.println(a+" "+b+" "+c);
}
public static void main(String args[])
{
Copy c=new Copy(10,20,30);
Copy c2=new Copy(c);
c.show();
c2.show();
}
}