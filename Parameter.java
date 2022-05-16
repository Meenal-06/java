class Parameter{
int a,b,c;
void setdata(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
//a=x;
//b=y;
//c=z;
}
void show()
{
System.out.println(a+"  "+b+"  "+c);
}
public static void main(String args[])
{
Parameter p=new Parameter();
Parameter p1=new Parameter();
p.setdata(10,20,30);
p1.setdata(100,200,300);
p.show();
p1.show();
}
}