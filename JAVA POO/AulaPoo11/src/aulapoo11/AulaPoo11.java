/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo11;

/**
 *
 * @author Usuário
 */
public class AulaPoo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Visitante v1 = new Visitante();
        v1.setNome("Williams");
        v1.setIdade(22);
        v1.setSexo("M");
        
        
        Aluno a1 = new Aluno();
        a1.setNome("bkhghgj");
        a1.setIdade(33);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("EUA");
        b1.setSexo("M");
        b1.setIdade(22);
        System.out.println(b1.toString());
        
    }
    
}
