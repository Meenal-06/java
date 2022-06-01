class A{
void show()
{
System.out.println("Hello from A");
}
}
class B extends A{
void display()
{
System.out.println("Hello from B");
}
}
class C extends B{
void displa()
{
System.out.println("Hello from C");
}
}
class Refrence{
public static void main(String args[])
{
A a1;
B b1;
C c1=new C();
a1=c1;
b1=c1;
a1.show();
b1.show();
b1.display();
c1.show();
c1.display();
c1.displa();
}
}