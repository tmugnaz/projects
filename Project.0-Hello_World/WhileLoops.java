public class WhileLoops {
    public static void main(String[] args) {
        int i=500;
        while(i<4000){
            try{
                Thread.sleep(20);
            } catch( Exception e){
                System.err.println(e);
                
            }
            System.out.println(i);
            i+=500;

        }

        // double runNum = Math.random();

        // while( runNum<0.5){
        //     runNum = Math.random();
        //     System.out.println( runNum);
        // }
        // System.out.println( runNum);


        double randN  ;

        do{ randN= Math.random();
            System.out.println(randN);

        }while(randN<0.5);
        






        
    }
    
}
