/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contnumeros;

import javax.swing.JOptionPane;
/**
 *
 * @author Usuário
 */
public class ContNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, cont=0, cont2=0, cont3=0 ;
        int media=0, cont4=0, val;
       
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
            cont++;
            s+=n;
            val = (n % 2==0)? cont2++ : cont3++;
            
            if (n>100){
                cont4++;
            }
        }
        
        while(n != 0);
        media = (s/(cont-1));
        JOptionPane.showMessageDialog(null, (cont-1) +"   " + (cont2-1)+"   " + cont3+"   " +cont4+"   " +media);
    }    
    
}
