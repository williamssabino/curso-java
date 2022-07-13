/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo07;

/**
 *
 * @author Usuário
 */
public class AulaPoo07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[]= new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy","França", 31,13, 3, 1, 68.9f, 1.75f);
        
        l[1] = new Lutador("Putscript","Brasil",29,14,2,3,57.8f,1.68f );
        
        l[2] = new Lutador("Snapshadow","EUA",35,12,2,1,80.9f,1.65f );
        
        l[3] = new Lutador("Dead Code","Australia",28,12,0,2,81.6f,1.93f );
        
        l[4] = new Lutador("UFocobol","Brasil",37,5,4,3,119.3f,1.7f );
        
        l[5] = new Lutador("Nedaart","EUA",30,12,2,4,105.7f,1.81f );
        
        Luta l1 = new Luta();
        l1.marcarLuta(l[0], l[1]);
        l1.Lutar();
        l[0].apresentacao();
        
    }
    
}
