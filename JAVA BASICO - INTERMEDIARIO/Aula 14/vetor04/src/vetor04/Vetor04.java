/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Usuário
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]= {3, 4, 6, 7, 8};
        for (int v:vet){
            System.out.print(v);
        }
        System.out.println("");
        int pos = Arrays.binarySearch(vet, 8);
        System.out.println(pos);
    }
    
}
