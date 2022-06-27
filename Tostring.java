class Tostring
{
String msg;
Tostring(String str){
msg=str;
}
public String toString()
{
return msg;
}
public static void main(String args[])
{
Tostring t1=new Tostring("Hello");
Tostring t2=new Tostring(" Indore");
System.out.print(t1);
System.out.print(t2);
}
}
