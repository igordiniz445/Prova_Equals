/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int n;
        int[] array;
        
        System.out.print("Entrada: N = ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        array = new int[n];
        
        System.out.print("Array: ");
        for(int i=0;i<array.length;i++){
            array[i] = in.nextInt();
        }
        
        System.out.println("Número de pares de meias: "+countPairs(n,array));
    }
    
    public static int countPairs(int len, int[] array){
        int pairSum = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]!= -1 & array[i] == array[j]){
                    array[j]= -1;
                    pairSum ++;
                    break;
                }
            }
        }
        return pairSum;
    }
    
}
