import java.util.Scanner;
class Test
{
	public static void main(String args[])
    {
      int n,i;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the num:");
      n=sc.nextInt();
      i=1;
      while (i<=10)
      {  
       System.out.println(n+"*"+i+"="+n*i );
        i++;

      }
            


    }

}