class Find{
public static void main(String args[])
{
String str="indore is in india";
int x=0;
while(x>=0)
{
x=str.indexOf("in",x);
if(x!=-1)
{
System.out.println(x);
x++;
}
}
}
}