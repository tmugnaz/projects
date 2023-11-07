package project4_binario;
import java.util.Random;
public class ricarca_binaria {
    public static void main(String[] args) {


        Random random = new Random();
        int lunghezza;
        lunghezza = random.nextInt(20);
        System.out.println(lunghezza);
        
        int[] pieno = toFill(lunghezza);
        for (int i =0;i<pieno.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int target ;
        target= random.nextInt(lunghezza-1);
        System.out.println("target è : " + target);
        int posizione = toSearch(pieno,target);
        if (posizione==-1){
            System.out.println("non trovato");

        }else{
           System.out.println("il target è in posizone " + posizione);
        }

        
    }
    



    public static int[] toFill (int a){
    int [] full = new int[a];
    for( int i=0; i<full.length;i++){
        full[i]=i;
    }
    return full;
    }

    public static int toSearch (int[] arr, int target){
        int posizione =-1;
        int sx=0;
        int dx=arr.length;
        int medio;
        boolean trovato = false;
        while(trovato==false ||sx==dx ){
            medio=(sx+dx)/2;

        if (target==arr[medio]){
            posizione=medio;
            trovato = true;
        }else if( target > arr[medio]){
            sx=medio;

        }else{
            dx=medio;
        }
    
    }
        return posizione;
    }
      
    }

