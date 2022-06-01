class A{
void show()
{
System.out.println("Hello from A");
}
}
class B{
void show()
{
System.out.println("Hello from B");
}
}
class Methodoverriding{
public static void main(String args[])
{
A a1=new A();
B b1=new B ();
a1.show();
b1.show();

}
}