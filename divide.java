import java.util.Scanner;
class Test
{
	// divide 2 num from user;
     public static void main (String arg[])	
     {
       int a,b;
       float c;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter 2 values:");
       a=sc.nextInt();
       b=sc.nextInt();
      if(b!=0)
      {
       c=(float)a/b;
        System.out.println("Division of 2 values:"+a+"and"+b+"is"+c);

     }
     else 
     {
     	System.out.println("Division is not!!!");
     }
}
}