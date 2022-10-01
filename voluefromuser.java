import java.util.Scanner;
class Test
{
	public static void main(String a[])
	{
       System.out.println("Enter value of Princple,Rate and Time:");
       Scanner sc = new Scanner(System.in);
       int p = sc.nextInt();
       float r = sc.nextFloat();
         int t = sc.nextInt();
         float si= (p*r*t)/100;
         System.out.println("Simple Interest is:"+si);

	}
}