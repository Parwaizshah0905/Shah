/*// Super-Super is a key-word which is mainly use to access immediate parent 
class datat member and mamber function. 
We can use super with variabe , method and constructor.
//(1)Super With Variable-if we want to access parent class variable 
inside a chailed class method when we will use super key word inside chsilde 
class method to access parent class method.*/ 
/*class Dummy
{
   int a=10;
}
class Demo extends Dummy
{
   //int a=20
  void show()
   {
        //int a=30   
     // System.out.println(a);
      System.out.println(this.a);//yaha this day super.a me internaly reples ho jata hai.
      //System.out.println(super.a); 
   }
    public static void main(String gg[])
     {
        Demo d=new Demo();
       d.show();
    }
}*/

  
/* VVIMP Super WIth Constructor/Costructor With Chaning Class-if we want to call imiddiate parent class constructor
 then we will use super keyword but in custructor calling super alwas writen with 
first line.
{When we will not write this and super in first line of any constructor 
then compiler will always write super for default constructore in first 
line of every constructor.}*/

/*class Dummy
{
   Dummy(int a)
   {
   System.out.println(a*a);
    }
}
 class Demo extends Dummy
{
     Demo()       /*required: intfound:no arguments reason: actual and formal argument lists differ in length1 error 
                   ye error jb ayegi jb syper me perameter nagi paas krege tb*/
     {         
        super(10);
     System.out.println("default constructor is running");
       }
    public static void main(String gg[])
     {
        Demo d=new Demo();
       
      }
} */
 
/*Note-jb hum chailed class ke constructor me se parent claas ke construcore 
 ko call krege tb hum use karege super ka.*/

//One more imp progame super with constructor
class Dummy
   {
   Dummy()
    {
   System.out.println("default constructor is running from Dummy");
    }
     }
 class Demo extends Dummy
{
     Demo()     
       {            
     System.out.println("default constructor is running from Demo");
       }
    public static void main(String gg[])
       {
        Demo d=new Demo();
       }
} 