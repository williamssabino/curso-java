/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo09ex1;

/**
 *
 * @author Usuário
 */
public class AulaPoo09Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];
        
        p[0] = new Pessoa("Williams","M",22);
        p[1] = new Pessoa("Sophia","F",0);
        
        l[0] = new Livro("Amanha","williams",200,0,false,p[1]);
        l[1] = new Livro("hoje","williams",376,0,false,p[0]);
        
        l[0].abrir();
        l[0].detalhes();
        l[1].detalhes();
       
        
        
    }
    
}
