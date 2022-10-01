import java.util.Scanner;
class Test
{
	public static void main(String args[])
    {
      int n,i;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the num:");
      n=sc.nextInt();
      i=2;
      while (i<=n)
      {  
       System.out.print( i+"," );
        i=i+2;

      }
            
    }

}