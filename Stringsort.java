class Stringsort{
public static void main (String args[])
{
String str[]={"indore","bhopal","dewas","ujjain","dhar","india","indonesia","bhind"};
String temp;
for(int i=0;i<str.length-1;i++)
{
for(int j=i+1;j<str.length;j++)
{
if((str[i].compareTo (str[j]))>0)
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.print("Sorted String array = ");
for(String s: str)
System.out.print(s+",");
}
}
