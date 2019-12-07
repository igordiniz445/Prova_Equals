/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author igorc
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tamanho do Array: ");
        int arraySize = in.nextInt();
        
        int[] array  = new int[arraySize];
        System.out.println("Dados do Array: ");
        for(int i=0;i<arraySize;i++){
            array[i] = in.nextInt();
        }
        
        System.out.println("Minino de Swaps: "+quantidadeMinimaTroca(array));
    }
    
    public static int quantidadeMinimaTroca(int[] array){
        int count = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] != i+1){
                int aux = array[array[i]-1];
                array[array[i]-1] = array[i];
                array[i] = aux;
                count ++;
            }
        }
        return count;
    }
}
