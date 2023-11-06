package ProjectMagichat;
import java.util.Random;


public class MagicHat {
    public static void main(String[] args) {
        String[] Students = new String []{
            "Paolo Lauria","Luigi Palladino","Francesca Daniele", "giovanni rinaldi","sara sessa", "francesco moxedano", "alessandro esposito","giorgiua melindo"
            , "fabio manna","bryan augustine", "salvatore orecchio", "Gianluca marano","marco suriano", "ciro matarese", "Valentina issich", "michelangelo mustatiello",  
            "giacomo santi", "karim", "martina casucci", "alessio del punta", "tommaso mugnai", "nicola piacquaddio", "bechir", "mario reva",
            "federico quai", "donato di palma", "alberto cenni",
            "renato eva", "daniele schiavo" 
        };
        final int NUM_HOUSES=4;
        final int DIM_HOUSES= Students.length/NUM_HOUSES +1;
        final int RESTO = Students.length%NUM_HOUSES;

        String[] Gryffindor= new String[DIM_HOUSES];
        String[] Slytherin= new String[DIM_HOUSES];
        String[] Hufflepuff= new String[DIM_HOUSES];
        String[] Ravenclaw= new String[DIM_HOUSES];
        int iG=0, iS=0, iH=0, iR=0;

        Random hat = new Random();
        int destiny ;

        for(int i =0;i<(Students.length-RESTO);i++){
            
            boolean assigned =false;
            do{
                destiny = hat.nextInt(NUM_HOUSES);

            switch(destiny){
                case 0: 
                    if(iG< DIM_HOUSES-1){
                        Gryffindor[iG]=Students[i] ;
                        iG++;
                        assigned = true;
                    }

                break;
                case 1:
                    if(iS< DIM_HOUSES-1){
                        Slytherin[iS]=Students[i];
                        iS++;
                        assigned = true;}

                break;
                case 2:
                    if(iH< DIM_HOUSES-1){
                    Hufflepuff[iH]=Students[i];
                    iH++;
                    assigned = true;}

                break;
                    
                case 3:
                    if(iR< DIM_HOUSES-1){
                        Ravenclaw[iR]=Students[i];
                        iR++;
                        assigned = true;
                    }

                break;
            }
        } while(!assigned);

        }
      
        for (int i = (Students.length- RESTO);i<Students.length;i++){
             boolean assigned =false;
             destiny = hat.nextInt(NUM_HOUSES);
            do{
                destiny = hat.nextInt(NUM_HOUSES);

                switch(destiny){
                    case 0: 
                        if(iG< DIM_HOUSES){
                        Gryffindor[iG]=Students[i] ;
                        iG++;
                        assigned = true;
                    }

                    break;
                    case 1:
                        if(iS< DIM_HOUSES){
                            Slytherin[iS]=Students[i];
                            iS++;
                            assigned = true;}

                    break;
                    case 2:
                        if(iH< DIM_HOUSES){
                            Hufflepuff[iH]=Students[i];
                            iH++;
                            assigned = true;
                        }

                break;
                    
                case 3:
                    if(iR< DIM_HOUSES){
                        Ravenclaw[iR]=Students[i];
                        iR++;
                        assigned = true;
                    }

                break;
            }
          
            } while(!assigned); 
            }
         
            




       
        System.out.println("Casa Gryffindor");

        for (int i =0;i<Gryffindor.length;i++){
            
            System.out.print(" "+Gryffindor[i]+" ");
        }

        System.out.println("\n Casa Slytherin");

        for (int i =0;i<Slytherin.length;i++){
            
            System.out.print(" "+Slytherin[i]+" ");
        }

        System.out.println("\n Hufflepuff");

        for (int i =0;i<Hufflepuff.length;i++){
            
            System.out.print(" "+Hufflepuff[i]+" ");
        }

        System.out.println("\n Casa Ravenclaw");

        for (int i =0;i<Ravenclaw.length;i++){
            
            System.out.print(" "+Ravenclaw[i]+" ");
        }


                
        


        
        
    }
    
}
