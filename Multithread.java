class Multithread{
public static void main(String args[])
{
Thread t1= new Thread();
System.out.println(t1);
System.out.println(t1.getName());
t1.setName("My thread");
System.out.println(t1);
System.out.println(t1.getName());
System.out.println(t1);
System.out.println(t1.getPriority());
t1.setPriority(Thread.MAX_PRIORITY);
System.out.println(t1.getPriority());
System.out.println(t1);
System.out.println(t1.isAlive());
try{
for(int i=1;i<=5;i++)
{
System.out.println("Hello "+i);
t1.sleep(2000);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println("Bye");
}}

