import java.util.Scanner;
class Test
{
	public static void main(String args[])
    {
      int n,i,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value:");
      i=sc.nextInt();
      n=1;
      while(n<=10)
      {  
        sum=sum+n;
        n++;

      }
            System.out.println("Sum of all value:"+sum);


    }

}