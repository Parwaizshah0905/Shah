import java.util.Scanner;
class Sum
{
	int a,b,c;
    void get()
{
	  Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 values:");
      a=sc.nextInt();
        b=sc.nextInt();
}
      void add()
      {
         c=a+b;   
                   }
      void show()

      {
         System.out.println("Sum of "+a+"and"+b+"is"+c);
    } 
    class Test
      {
         public static void main(String ar[])
     {
      Sum s1=new Sum();
      s1.get();
      s1.add();
      s1.show();
        }
    
    }
}