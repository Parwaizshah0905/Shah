import java.util.Scanner;
class Test
{
	// divide 2 num from user;
     public static void main (String arg[])	
     {
       
       int a;
       int b;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter 2 values:");
       a=sc.nextInt();
       b=sc.nextInt();
      if(a>b)
      {
       
        System.out.println("A is grater");

     }


     else if (b>a)
     {
      System.out.println("B is grater");
     }

     else 
     {
     	System.out.println("Both value are equal ");
     }
}
}