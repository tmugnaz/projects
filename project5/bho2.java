package project5;

public class bho2 {public static void main(String[] args) {
     String parola="oidocrop";
     System.out.println(toReverse(parola));
        
     
       
    }
    


public static String toReverse(String parola){
    String reverso="";
    for(int i=parola.length()-1;i>=0;i--){
        reverso = reverso+ parola.charAt(i);

    }
    return reverso;}
    
}
    

