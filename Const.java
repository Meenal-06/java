class A{
A(){
System.out.println("Hello from class A");
}
}
class B extends A{
B(){
System.out.println("Hello from class B");
}
}
class C extends B{
C(){
System.out.println("Hello from class C");
}
}
class Const{
public static void main(String args[])
{
System.out.println("Costructor call from object of A class");
A a=new A();
System.out.println("Costructor call from object of B class");
B b= new B();
System.out.println("Costructor call from object of C class");
C c =new C();
}
}


