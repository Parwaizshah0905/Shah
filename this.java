/*class Demo
{
    void show()
  {
    System.out.println(this);  
  }
 public static void main(String gg[])
 {
  Demo d=new Demo();//d is a local variable. 
  System.out.println(d);
  d.show();
  
  }
}*/

//When we wil call a known static method 
//with the help of refrence variable in java 
//then in side the method we can accses value 
//of refrense variable with the help of this 
//key word
/*Note main method ke bahar jo d hai vo this hai
or agr usko accses krna hai to uske liye phle known 
static method bnana pdegi*/

/* (1)This with variable=>If we want to accses instant 
globale variable inside any method when we will use this 
key word and if local and global both varables
have same name and we want to transfer value from 
local to globale we will use this key word to accses 
parent class global variable.*/ 
/* Note agr me kisi global value kisi consatract ya method me 
accses krna chata hu to uske liye this.variable ka name likna 
hai*/


//this with variable programe 
/*    class Demo
{
    int a=10;
    void show()
  {
    int a=20;
      System.out.println(a);
    System.out.println(this.a);  
  }
 public static void main(String gg[])
 {
  Demo d=new Demo();//d is a local variable. 
    d.show();
  
  }
}*/
//Main use this with variable programe 
 
 /*  class Emp
{
    int empno;
    String name;
    Emp(int empno, String name)
  {
      this.empno=empno;   //Locl ko global me covert krne ke liye this. ka us ekra
      this.name=name;  
  }
  void show()
   {
    System.out.println(empno+" "+name);
   }
 public static void main(String gg[])
 {
  Emp d=new Emp(101,"ajay");//d is a local variable. 
    d.show();
  
  }
}*/
// One more programe on this key-word
/*class Emp
{
    int id;
    String name;
    Emp(int id, String name)
  {
      this.id=id;   //Locl ko global me covert krne ke liye this. ka us ekra
      this.name=name;  
  }
  void show()
   {
    System.out.println(this.id+" "+this.name);
    
   }
 public static void main(String gg[])
 {
  Emp e1=new Emp(101,"ajay");
   Emp e2=new Emp(102,"jay");
    Emp e3=new Emp(103,"jaya");//d is a local variable.
    System.out.println(e1.id+" "+e1.name);
    System.out.println(e2.id+" "+e2.name);
    System.out.println(e3.id+" "+e3.name); 
    e1.show();
    e2.show(); 
    e3.show();
  
  }
}*/
// This With A Constructor OR Chaning of Constructor.
  /*class Demo
   {
      Demo()
      {
        System.out.println("Default constructor is running");      
      }
      Demo(int a)
      {
          this();
         System.out.println(a*a*a);
        //  this();     /*error: call to this must be first statement in constructor this();/*
          
      } 
       Demo(int a,int b)
      {
           this(5);
         System.out.println(a*b);
      }
      public static void main (String gg[]) 
    {
      Demo d=new Demo(10,20); 
    }
  }*/
// Method Chaning OR This With Method. 
 class Demo
 {
   void show()
   {
      System.out.println("show is running");
    }
    void display()
   {
          this.show();  
       System.out.println("display is running");
       show();//compiler will add this.show();
   }
    public static void main(String gg[])  
      {
         Demo d=new Demo();
           d.display();
        }
  }
//Note  constructor ke time me this 1 hi bar hona chahiye 1 hi line me pr method ke case me thsi jahah chaho vha use kr lo. 