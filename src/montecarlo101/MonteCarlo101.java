/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package montecarlo101;

import java.util.Random;

/**
 *
 * @author lefty
 */
public class MonteCarlo101 {

    /**
     * @param args the command line arguments
     */
    
    public static void PrintArray(int[] array_, String message){
        System.out.println(message);
        for (int i=0; i<array_.length;i++ ){
            System.out.print(array_[i]+", ");
        }
        
        System.out.println("_______________________");
        System.out.println("");
    }
    
    public static int[] RandomArrayInit (int range_low, int range_high, int number){
        Random ran = new Random();
        int[] ret = new int [number];
        for (int i = 0; i<number; i++){
            ret[i] = ran.nextInt((range_high-range_low)+1)+range_low;
        }
        
        return ret;
    }
    
    public static int[] RandomArrayInitR(int range_low, int range_high, int index, int[] array)
    {
        // 1-50, 0, rand;
        Random ran = new Random();
        
        if (index == array.length){
            return array;
        }
        
        else{
            
            array[index]= ran.nextInt((range_high-range_low)+1)+range_low;
            index++;
            RandomArrayInitR(range_low, range_high, index, array);
            
            
            
        }
        
        return array;
    }
    
    public static void main(String[] args) {
        int[] a = RandomArrayInit(1, 100, 56);
        PrintArray(a,"for cycle random array");
        
        
        int[] b = new int[56];
        b = RandomArrayInitR(1, 100, 0, b);
        PrintArray(b, "Recursive array init");
        
        
        
        
    }
    
}
