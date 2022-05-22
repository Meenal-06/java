class Stringarray{
public static void main(String args[])
{
String str[]={"indore","bhopal","dewas","dhar","ujjain","india","indonasia","bhind"};
for(String s:str)
{ 
if(s.indexOf("ind")==0)
System.out.print(s);

//if(s.indexOf("in")>=0)
//System.out.print(s);
}
}
}