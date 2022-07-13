/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinal;

/**
 *
 * @author Usuário
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gafanhoto g[] = new Gafanhoto[3];
        Video v[] = new Video[2];
        
        g[0]=new Gafanhoto("williams","M",22,"1234");
        
        v[0]= new Video("HTML 10");
        
        Visualizacao vis = new Visualizacao(g[0],v[0]);
        
        System.out.println(g[0].toString());
        
    }
    
}
