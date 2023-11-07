package project5;
//import java.util.Random;
import java.util.Scanner;

public class bho {public static void main(String[] args) {
//Random random =new Random();
// int a = random.nextInt(30);
// int b = random.nextInt(30);
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();


int somma, resto, moltiplicazione ,sottrazione;
double divisione;



if(a==0||b==0){
    System.out.println("divisione errore");
    divisione =-1;
    resto = -1;

}else if(a>b){
    divisione = (double)a/b;
    resto= a % b;

}else{ divisione = (double)b/a;
    resto= b % a;

}
somma = a+b;
moltiplicazione= a*b;
sottrazione = Math.abs(a-b);
System.out.println(somma+" " +moltiplicazione+" "+ divisione +" "+sottrazione+" "+resto);
    scanner.close();


int[] array = new int[6];
int j=0;

while(j<array.length){
    array[j]=j;
    j++;    
}

for(int i =0;i<array.length;i++){
    System.out.print(array[i]+" ");
}


}
    
}
