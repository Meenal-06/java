import java.util.Arrays;
import java.util.Scanner;
class Anagram{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter First String");
String str1= sc.nextLine();
System.out.println("Enter Second String");
String str2= sc.nextLine();
if(str1.length()==str2.length())
{
char []a1=str1.toLowerCase().toCharArray();
char []a2=str2.toLowerCase().toCharArray();
Arrays.sort(a1);
Arrays.sort(a2);
boolean r = Arrays.equals(a1,a2);
if(r){
System.out.println(str1+" and "+str2+" are anagram string");
}
else
System.out.println(str1+" and "+str2+" are Not anagram");
}
else{
System.out.println(str1+" and "+str2+" are Not anagram");
}
}}