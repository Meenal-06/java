interface First{
int a=10;
void show();
}
interface Second{
int a=20;
void display();
}
class A implements First,Second
{
 public void show(){
System.out.println("Hello from Show");
}
public void display()
{
System.out.println("Hello from Display");
}
void add()
{
int x=First.a+Second.a;
System.out.println(First.a+ "+" +Second.a+ "="+x);
}
}
class Multipleinheritance{
public static void main(String args[])
{
A a1=new A();
//First f;
//f=a1;
//f.show();
a1.show();
a1.display();
a1.add();
}}