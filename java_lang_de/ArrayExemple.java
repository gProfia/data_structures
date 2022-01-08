package java_lang_de;

import java.util.Random;

public class ArrayExemple {
    
    public static void main(String[] args) {
        
        int[]  stockPrice20days = new int[20];
    
        Random generator = new Random();

        for (int i=0; i <  stockPrice20days.length; i++){
            stockPrice20days[i] = generator.nextInt(1000);
        }

        for(int i : stockPrice20days){
        System.out.print("[" + String.valueOf(i) + "] ");
        }
    }

}
