class Overload{
void add()
{
System.out.println("Sum=0");
}
void add(int a,int b)
{
System.out.println("Sum= "+(a+b));
}
void add(int a,int b,int c)
{
System.out.println("Sum="+(a+b+c));
}
void add(int a,int b,int c,int d)
{
System.out.println("Sum="+(a+b+c+d));
}
public static void main(String args[])
{
Overload o=new Overload();
o.add();
o.add(10,20);
o.add(10,20,30);
o.add(10,20,30,40);
}
}