/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author igorc
 */
public class Exercicio2 {
    
    
    
    public static void main(String[] args) {
        int rotacoes, arraySize;
        ArrayList<Integer> array;
        Scanner in;
        
        array = new ArrayList<>();
        
        System.out.print("Tamanho do Array = ");
        in = new Scanner(System.in);
        arraySize = in.nextInt();
        
        System.out.print("Número de rotações = ");
        in = new Scanner(System.in);
        rotacoes = in.nextInt();
        
        for(int i=0;i<arraySize;i++){
            array.add(i+1);
        }
        
        array = rotacaoEsquerda(rotacoes, array);
        System.out.println(array.toString());
    }
    
    public static ArrayList<Integer> rotacaoEsquerda (int rotacoes, ArrayList<Integer> array){
        for(int i=0;i<rotacoes;i++){
            int aux = array.get(0);
            array.remove(0);
            array.add(aux);
        }
        return array;
    }
}
