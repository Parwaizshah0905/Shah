import java.util.Scanner;
class Test
{
	public static void main(String a[])                            //doubt how to run two op. in single program
	{
       System.out.println("Enter value Three value:");
       Scanner sc = new Scanner(System.in);
       int p1 = sc.nextInt();
       int p2 = sc.nextInt();
       int p3 = sc.nextInt();
     
         int sum = (p1+p2+p3);
         System.out.println("Sum of three num is:"+sum);

                                                                
         System.out.println("Enter value Three value:");
       Scanner s = new Scanner(System.in);
       int p4 = sc.nextInt();
       int p5 = sc.nextInt();
       int p6 = sc.nextInt();
     
         int product = (p4*p5*p6);
         System.out.println("Product of three num is:"+product);

	}
}