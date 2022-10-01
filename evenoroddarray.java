import java.util.Scanner;
class Test
   {
     public static void  main(String arg[])
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of an Array:");
     int n= sc.nextInt();
     int a[]=new int [n];
     int sum=0;
     System.out.println("Enter"+n+"values:");
     for(int i=0;i<n;i++)

     {

       a[i]=sc.nextInt(); 
     }
     
       System.out.println("All  Even values are:");
     for(int i=0;i<n;i++)
     {
        if(a[i]%2==0){

          System.out.print(a[i]+",");
          sum=sum+a[i];
        }
         
      }
         System.out.println("\n Sum of Even values:"+sum);
  
          float avg=(float)sum/n;
      System.out.println("Average of all values:"+avg);
    
   
     
    
}
  }