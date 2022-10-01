import java.util.Scanner;
class Test
{
	// divide 2 num from user;
     public static void main (String arg[])	
     {
       
       int a;
       int b;
       int c;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter 3 values:");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
      if(a>b&a>c)
      {
       
        System.out.println("A is grater");

     }


     else if (b>a&b>c)
     {
      System.out.println("B is grater");
     }
     else if (c>a&c>b)
     {
      System.out.println("C is grater");
     }

     
     else 
     {
     	System.out.println("All value are equal");
     }
}
}