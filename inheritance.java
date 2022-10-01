class Demo extends Calculator
{
 void show()
 {
  System.out.println("show is running from Demo");
  }
   public static void main (String gg [])
   {
   Demo d=new Demo();
   d.show();
   d.add(20,2); 
    }
}
/*inheritance me phle first class ko compile krna jruri hai
uske bad secound se first class ko inherit krna hai.*/
/*Note -jese hi first class ko run krege uska byte code 
ban jata hai uske bad hi secound se first ko extends krege*/