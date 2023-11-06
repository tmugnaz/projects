package Project_3_Arrays;

public class Arrays {
    public static void main(String[] args) {

        
        int[] nums = new int[5];
    //    for(int i=0;i<nums.length;i++){
    //     nums[i]=i;
    //     System.out.print(i+1 + "->");
    //     System.out.println(nums[i]);
    //    }
        for( int i =0; i<nums.length;i++){
            if(i%2==0){
                nums[i]=2*i;

            }else{
                nums[i]=3*i;
            }
            System.out.print(i+1 + "->");
            System.out.println(nums[i]);


        }
        //int [] vettore = new int[];
        int massimoVettore =0;

        for(int i=0; i<nums.length;i++){
            if(massimoVettore < nums[i]){
                massimoVettore =nums[i];

            }
            

        }System.out.println(massimoVettore);
        for(int i=0; i<nums.length;i++){
            if(massimoVettore > nums[i]){
                massimoVettore =nums[i];

            }
            

        }System.out.println(massimoVettore);
        int somma =0;
        for(int i=0; i<nums.length;i++){
           somma = somma + nums[i];
            

        }System.out.println(somma);
        double medio = (double)somma/nums.length;
        System.out.println(medio);
        int primo =nums[0];

        for(int i =0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
            if(i ==nums.length-2){
                nums[nums.length-1]=primo;  
            }
            

            
        }
        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.err.println("");

        
        int target =8;

       for (int i=0;i<nums.length;i++){
        System.out.println("sto analizzando la posizione "+i);
             if(nums[i]==target){
                
                System.out.println("trovato!, era in posizione "+ i);
                break;
             }

        }
        
        nums[nums.length-1]=9;
        
        
        
        

        for(int i = 0;i<nums.length;i++){
           
            
            for(int j=i+1;j<nums.length;j++){
                int repeated =1;
                int numeroRipetuto = 0 ;
                if(nums[j]==nums[i]){

                    repeated ++;

                    numeroRipetuto = nums[i];

                    System.out.println("il numero " + numeroRipetuto + " è ripetuto "+ repeated +" volte" );
                    
                    
                     

                }

            }

        }

          int[] nums1 =   new int[] {2,1,3,3,5,5,3,5,4,4};
         



        int mode = 0;
        int ripetuto =0;
        int temp=0;

        for (int i =0;i<nums1.length;i++){
            

            for(int j=i+1;j<nums1.length;j++){
                ripetuto=0;

                if(nums1[i]==nums1[j]){
                    ripetuto++;
                    
                }if (ripetuto>temp){
                    temp=ripetuto;
                    mode = nums1[i];
                    
                }
                

            }
        }

        System.out.println(mode);
          
        















    }


        

     
        

        

        














        


       
       

        
    

    
}
