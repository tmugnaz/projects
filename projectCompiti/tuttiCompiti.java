package projectCompiti;
import java.util.Random;

public class tuttiCompiti {
    public static void main(String[] args) throws IndexOutOfBoundsException{
        //Es.11
        System.out.println("Siamo i caMpioni del Mondo!");
        //Es.12
        String cane= "cane";
        String gatto ="gatto";
        System.out.println(cane +" " + gatto);
        
        //Es.13


        Random random = new Random();
        int primo= random.nextInt(30);            // due numeri casuali
        int secondo = random.nextInt(30);
        System.out.println(primo+" "+secondo);          // li stampo 
        System.out.println(primo+secondo);              // stampola somma
        double diviso;
        System.out.println(primo*secondo);              // stampo la moltiplicazione
        try{                                            // visto che i miei numeri sono casuali devo fare un try catch
        if(primo>=secondo){                             // caso primo>=secondo
            System.out.println(primo-secondo);
            diviso = (double) primo/secondo;            // la divisione la casto a double
            System.out.println(diviso);
            System.out.println(primo % secondo);
              
        }else {
            System.out.println(secondo-primo);
            diviso = (double) secondo/primo;
            System.out.println(diviso);
            System.out.println(secondo % primo);
            
        }}catch (Exception e){                                 // se uno dei due è 0 stampo il messaggio
            System.out.println("impossibile dividere per 0");
        }
        
          


        //Es.14
        for(int i=0;i<6;i++){
            System.out.println("siamo i Campioni del Mondo");
        }


        //Es.15
        for(int i =0;i<6;i++){
            System.out.println("siamo i Campioni del Mondo");
            if (i==2){
                break;
            }
        }
        //Es.16
        int[] arr = new int[6];   
        arr[1]=0;                   //operazione a caso per non farmi dare errore


        //Es.17
        int[] newArr = new int[6];                 // array di 6
                                                
        int k=0;                                   // contatore

        while(k<newArr.length){                             //quando k è uguale alla lunghezza del nostro array si interrompe
            newArr[k]=random.nextInt(30);     // ogni ciclo creo un numero casuale e lo metto in posizione k
            k++;
            
        }

        for(int i=0;i<newArr.length;i++){           //lo stampo o toString(newArr)
            System.out.print(" "+newArr[i]);
        }

        System.out.println();

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {       // lo ordino oppure toSort(newArr); 
                if (newArr[i] < newArr[j]) {
                 int temp = newArr[i];
                 newArr[i] = newArr[j];
                 newArr[j] = temp;
                }
            }
        }    
            
        for(int i=0;i<newArr.length;i++){           // lo ristampo per verificare oppure toString(newArr)
            System.out.print(" "+newArr[i]);}
        System.out.println();


        //Es.18
        int newArr1[]= new int[6];              // array di 6
        for(int i=0;i<newArr1.length;i++){       // lo riempio di numeri casuali o toFill(newArr1,30)
            newArr1[i]=random.nextInt(30);
        }
        for(int i=0;i<newArr1.length;i++){         // lo stampo o toString(newArr1)
            System.out.print(" "+newArr1[i]);
        }
        for (int i = 0; i < newArr1.length; i++) {             // lo ordino
            for (int j = 0; j < newArr1.length; j++) {         // oppure richiamo toSearch(newArr1)
                if (newArr1[i] < newArr1[j]) {
                 int temp = newArr1[i];
                 newArr1[i] = newArr1[j];
                 newArr1[j] = temp;
                }
            }
        }                             
        int temp=0;
        for(int i =0;i<newArr1.length;i++){       //tramite la variabile temporanea temp sommo i numeri dell'array
            temp=temp+newArr1[i];                
        };
        int media=temp/newArr1.length;               // valore medio dell'array
        int mediano = newArr1[(0+newArr1.length)/2]; // valore mediano
        System.out.println("\nvalore più piccolo "+newArr1[0]+"\nvalore più grande "+newArr1[5]+"\nlunghezza "+newArr1.length+"\nvalore mediano "+mediano +"\nla media è "+media);
        ;                                          // stampo i valori ora che so che sono ordinati
        
        //Es.19
        String [] insieme = new String[] {"cane","gatto","criceto","macaco","pappagallo"};
        int parolaAcaso = random.nextInt(insieme.length);            //numero casuale per decidere la parola da prendere
        System.out.println(parolaAcaso);                             // stampo il numero casuale e la parola
        System.out.println(insieme[parolaAcaso]);
        char[]parola =new char[insieme[parolaAcaso].length()]; // creo un array di char di lunghezza pari alle lettere nella parola corrispondente
        String choice = insieme[parolaAcaso];
             

        for (int i =0;i<parola.length;i++){                          // leggo le lettere una ad una le metto dentro il nostro array                
            parola[i]=insieme[parolaAcaso].charAt(i);                // ho usato il metodo .charat dopo svariati tentativi
        }
        String result="";
        for(int i= choice.length()-1;i>0;i--){
            result+=choice.charAt(i);
        }
        System.out.println(result);
        

        for(int i=parola.length-1;i>=0;i--){                         // leggo array al contrario
            System.out.print(parola[i]+" ");
        }
        System.out.println();
        
        char appoggio;
        
        for (int i=0;i<parola.length/2;i++){                   // provo ad invertire il contenuto delle caselle array
            appoggio = parola[i];
            parola[i]= parola[parola.length-i-1];
            parola[parola.length-i-1]= appoggio;
                    
        }
        for(int i=0,j=parola.length-1;i<j;i++,j--){            // le inverto di nuovo
            appoggio= parola[i];
            parola[i]=parola[j];
            parola[j]=appoggio;
        }
        
        for(int i=0;i<parola.length;i++){                        //leggo l'array sperando sia giusto
            System.out.print(parola[i]);
        }

        //Es.20
        int[] newArr2 = new int[10];                             
        for(int i=0;i<newArr2.length;i++){                        
            newArr2[i]=random.nextInt(100);
        }
        System.out.println();
        for(int i=0;i<newArr2.length;i++){         
            
            System.out.print(newArr2[i]+" ");
        }

        int j=0;                                   
        int totale=0;                              
        do{
            totale=totale+newArr2[j];               
            j++;                                   
        }while(j<newArr2.length);
        System.out.println();
        
        System.out.println(totale);

        //Es WeekEnd
        int[]newArr3=new int[20];
        for(int i=0;i<newArr3.length;i++){
            newArr3[i]=i;
        }
        int target ;
        target= random.nextInt(newArr3.length-1);
        System.out.println("target è : " + target);
        int posizione = toSearch(newArr3,target);
        if (posizione==-1){
            System.out.println("non trovato");

        }else{
           System.out.println("il target è in posizone " + posizione);
        }


        



        
    }

    public static void toSort(int newArr[]){                     
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (newArr[i] < newArr[j]) {
                 int temp = newArr[i];
                 newArr[i] = newArr[j];
                 newArr[j] = temp;
                }
            }
        }   
    }

    public static void toString(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void toFill(int[] arr, int a){
        Random random= new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(a);
        }
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
        }return posizione;
    }    
    



}



    
