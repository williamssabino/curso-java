/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Usuário
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[]= {3,5,67,4,-2};
        Arrays.sort(v); // coloca a lista em ordem
        for (int num: v){  // faz a repetiçao para cada posiçao no vetor
            System.out.println(num);
        }
    }
    
}
