import java.util.Scanner;
class Test
{
	// divide 2 num from user;
     public static void main (String arg[])	
     {
       
       int a, b ,c,e ,x;
      
       Scanner sc = new Scanner (System.in);
       System.out.println("Prress 1 for addition");
        System.out.println("Prress 2 for sub");
         System.out.println("Prress 3 for mul");

       System.out.println("Plese enter your choise:");
      
       x=sc.nextInt();
       switch(x)
   {
         case 1:
        System.out.println("Enter a value");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       e=a+b+c;
       System.out.println("Sum is"+e);
       break;
         case 2:
        System.out.println("Enter a value");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       e=a-b-c;
       System.out.println("sub is"+e);
       break;
         case 3:
        System.out.println("Enter a value");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       e=a*b*c;
       System.out.println("mul is"+e);
       break;

       }

         }
       }