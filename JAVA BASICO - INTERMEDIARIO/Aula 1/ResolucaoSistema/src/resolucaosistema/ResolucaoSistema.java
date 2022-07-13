/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Usuário
 */
public class ResolucaoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolucao é:");
        System.out.println(d.width +"X"+ d.height);
    }
    
}
