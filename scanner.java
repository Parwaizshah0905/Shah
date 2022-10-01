/*Note Scanner ek class class or ye final class hoti jo inherit nahi hai.
 jb ye inherit nahi hogi to iska egrigation krte hai or egrigation jb hota
hai to tb bnata hai object or object banta hai to call hota hai constractor

****or niche sb scaner class ke constractor hai jisko humne commandprompt me 
[ javap java.util.Scanner]iski madat se nikala.

 static final boolean $assertionsDisabled;
  public java.util.Scanner(java.lang.Readable);
  public java.util.Scanner(java.io.InputStream);
  public java.util.Scanner(java.io.InputStream, java.lang.String);
  public java.util.Scanner(java.io.InputStream, java.nio.charset.Charset);
  public java.util.Scanner(java.io.File) throws java.io.FileNotFoundException;
  public java.util.Scanner(java.io.File, java.lang.String) throws java.io.FileNotFoundException;
  public java.util.Scanner(java.io.File, java.nio.charset.Charset) throws java.io.IOException;
  public java.util.Scanner(java.nio.file.Path) throws java.io.IOException;
  public java.util.Scanner(java.nio.file.Path, java.lang.String) throws java.io.IOException;
  public java.util.Scanner(java.nio.file.Path, java.nio.charset.Charset) throws java.io.IOException;
  public java.util.Scanner(java.lang.String);
  public java.util.Scanner(java.nio.channels.ReadableByteChannel);
  public java.util.Scanner(java.nio.channels.ReadableByteChannel, java.lang.String);
  public java.util.Scanner(java.nio.channels.ReadableByteChannel, java.nio.charset.Charset);
 or innme se ek bhi constructer defaul nahi hai or ye jitne bhi constructor sb peramiterrise hai or peramitervise constructor obj leta hai.
peramiterrise con. peramiter me kis class ka obj lenta hai(ans InputStream is class ka leta hai.)
inputStream class ka obj nahi bna skte kyuki jsva ne alredy bna diya hai or ye obj refrence variable me save hai 
or jis refrence variable me iska obj rkha hai us rafrence variable ka name hai IN.

NOTE-System bhi final ise bhi inherit nahi kar skye hai or system me consructore bhi nahi hai  iska obj bji nahi bna 
skte isme bs ststic agrigation hoga.  
or IN yaha se dikhana hai jisme scanner class ka obj rakha hai.or use search ese karna hai.(javap java.lang.System)
or in jo hai static final hai pr System class me rakha hai((or yaha se agrigation ke System.in krke karna pdega)

[all proses in english]
Scanner is a final class so we cant inherit it when we will construct an obj of 
scanner class but scsnner class doesnt contain a default constructor 
and peramiterise constractor of scanner class will take obj of inputStream class 
but java alredy stored input streams class obj inside final static"IN"in 
refrence variable of system class.

PROGRAM
  