
class A
{
void show()
{
System.out.println("Hello from A");
}
}
class B extends A
{
void show()
{
System.out.println("Hello from B");
}
}
class C extends A
{
void show()
{
System.out.println("Hello from C");
}
}
class Runtimepoly{
public static void main(String args[])
{
A a1;
B b1=new B();
C c1=new C();
a1=b1;
a1.show();
a1=c1;
a1.show();
}
}