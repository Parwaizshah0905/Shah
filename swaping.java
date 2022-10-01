class Test 
{
	
public static void main(String args[] )
	 {
	 	int a,b;
	 	a=10;
	 	b=20;

		System.out.println("Before swapping->\n A:"+a+"\nB:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping->\n A:"+a+"\nB:"+b);
	}
}