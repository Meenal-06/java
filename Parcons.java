
class Parcons{
int a,b,c;
Parcons(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
void show()
{
System.out.println(a +" "+b+" "+c);
}
public static void main(String args[])
{
Parcons p=new Parcons(10,20,30);
Parcons p1=new Parcons(100,200,300);
p.show();
p1.show();
}
}
