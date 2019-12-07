/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author igorc
 */
public class Exercicio5 {

    public static void main(String[] args) {
        String bracket = new String();
        Scanner in = new Scanner(System.in);
        
        bracket = in.next();
        /*Se a String não tiver um tamanho par, automaticamente ela não está balanceada*/
        bracket = estaBalanceado(bracket);
        
        
        System.out.println(bracket);
    }
    
    public static String estaBalanceado(String bracket){
        if(bracket.length()%2 != 0 ){
            System.out.println(bracket+" - NÃO");
            System.exit(0);
        }
        int bracketLength = bracket.length();
        Stack<Character> pilha = new Stack<Character>();
        for(int i=0;i<bracketLength;i++){
            if(bracket.charAt(i)== '{' || bracket.charAt(i)== '[' || bracket.charAt(i)== '('){
                pilha.push(bracket.charAt(i));
            }else{
                if(pilha.peek()=='{' && bracket.charAt(i) == '}' ){
                    pilha.pop();
                }else if(pilha.peek()=='[' && bracket.charAt(i) == ']'){
                    pilha.pop();
                }else if(pilha.peek()=='(' && bracket.charAt(i) == ')'){
                    pilha.pop();
                }else{
                    System.out.println(bracket+" - NÃO");
                    System.exit(0);
                }
            }
        }
        return "SIM";
    }
    
}
