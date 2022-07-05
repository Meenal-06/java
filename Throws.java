class Throws
{
void div(int a,int b)throws ArithmeticException
{
int c;
if(b==1)
{
throw new ArithmeticException("/ bye one");
}
else
{
c=a/b;
System.out.println(c);
}
}
public static void main(String args[])
{
Throws t1 = new Throws();
try{
t1.div(10,1);
t1.div(10,0);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("Bye");
}
}
