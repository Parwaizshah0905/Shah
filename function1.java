import java.util.Scanner;
class Test
{
	static int intval()
{
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values:");
    
    int x=sc.nextInt();
    if(x<0)
{
         x=-x;
         }

   return x;
}
      public static void main(String rags [])
      {
        
        int a=intval();
        int b=intval();
         int c=a+b;
           System.out.println("Addition of two num:"+c);
        
      }
    
  }