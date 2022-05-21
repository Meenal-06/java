class Vowelcons{
public static void main(String args[])
{
String str=new String ("This is a class of java");
int v=0,c=0,sp=0,d=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	v++;
else if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))
     c++;
else if(ch==' ')
	sp++;
else if(ch<='0'&& ch>='9')
d++;

}
System.out.println("Vowel="+v);
System.out.println("Consonant= "+c);
System.out.println("Spaces= "+sp);
System.out.println("Digits= "+d);
}
}