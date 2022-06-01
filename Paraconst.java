class A{
A(int x,int y)
{
System.out.println("Hello from A " +x+" "+y);
}
}
class B extends A{
B(int a,int b,int c)
{
super(a,b);
System.out.println("Hello from B " +a+" "+b+" "+c);
}
}
class C extends B
{
C(int p,int q,int r)
{
super(p,q,r);
System.out.println("Hello from C " +p+" "+q+" "+r);
}
}
class Paraconst{
public static void main(String args[])
{
A a1=new A(10,20);
B b1= new B(100,200,300);
C c1=new C(1000,2000,3000);
}
}