class Logic{
 	public static void main(String args[])
	{
		int a=10,b=1,c=10;
		boolean x;
		x=(a++==b++) && (b++==++c);
		x=(--a==b--) && (b++==++c);
		System.out.println("a="+a );
          	System.out.println("b="+b);
		System.out.println ("c="+c);
System.out.println( "x="+x);
	}
}