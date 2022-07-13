/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo11;

/**
 *
 * @author Usuário
 */
public class Bolsista extends Aluno{
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa renmovada com sucesso!");
    }
   
    @Override
    public void pagarMensalidade(){
        System.out.println("Aluno Bolsista! pagamento facilitado ");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
