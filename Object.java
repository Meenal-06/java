class Object{
int a=10;//instance variable
public static void main(String args[])
{
Object t1=new Object();
Object t2=new Object();
System.out.println(t1.a);
System.out.println(t2.a);
t1.a++;
t2.a--;
System.out.println(t1.a);
System.out.println(t2.a);
System.out.println(t1);
System.out.println(t2);

}
}