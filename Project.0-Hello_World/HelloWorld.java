
public class HelloWorld {

    public static void main(String[] args) {
 
       

       int x = 3;
       
       
       System.out.println("Hello World! "+'\n' +  x);
       System.out.println(x);
       double y = 3.123;
       System.out.println(y);
       int z=9;
       System.out.println(z);
       double w=z;
       System.out.println(w);
       int k= (int) 3.14;
       System.out.println(k);
       int t= 27;
       System.out.println(t);;
       int r= x+t;
       System.out.println(r);
       /* 
       final int b= 3;
       boolean h=true;
       byte b1=8;
       short s1= 200; //16 bit signed
       int i1 = 1_000_000_000; // 32 bit signed
       long l1 = 10_000_000_000l; //64 bit signed
       char c1= 'a';
       float f1 = 3.14f; //32 bit floating point
       double d1= 3.14;*/

       boolean isBalanceNegative = false;

       if(isBalanceNegative){
         System.out.println("aaaaa");

        }
       double height= 1.70;
       int weight = 86;
        if (height>=2.00){
         System.out.println("sei alto");
         if(weight>110){
            System.out.println("sei cicciottello");   
         }else {
            System.out.println("vai a giocare a basket");
         }
        }else if( height>= 180&& weight >90){
         System.out.println(("sei alto ma anche ciciottello"));
        } else if (height>=180 && weight<= 90){
         System.out.println("sei basso");
        };











       











 
    }




  
 }