class Final{
 final int a;
Final(int x){
a=x;
}
void show(){
System.out.println(a);
}
public static void main(String args[])
{
Final f1=new Final(10);
Final f2=new Final(100);
f1.show();
f2.show();
}
}