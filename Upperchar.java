class Upperchar{
public static void main(String args[])
{
String str=new String("Hello");
char ch;
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
if(ch>=97 && ch<=127)
System.out.print((char)(ch-32));
else
System.out.print(ch);
}
}
}

