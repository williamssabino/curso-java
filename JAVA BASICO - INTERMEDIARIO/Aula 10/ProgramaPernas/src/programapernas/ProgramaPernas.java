/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Quantas pernas tem?: ");
        int pernas = t.nextInt();
        String tipo;
        
        switch(pernas){
            case 1 :
                tipo = "SACI";
                System.out.println(tipo);
                break;
            
            case 2:
                tipo = "BÍPEDE";
                System.out.println(tipo);
                break;
                
            case 4:
                tipo = "QUADRUPEDE";
                System.out.println(tipo);
                break;
                
            case 6,8:
                tipo = "ARANHA";
                System.out.println(tipo);
                break;
        
            default:    
                tipo = "ET";
                System.out.println(tipo);
                break;
        }
    }
    
}
