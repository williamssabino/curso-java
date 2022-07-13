/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo12;

/**
 *
 * @author Usuário
 */
public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("soltou bolha");
    }

    @Override
    public void Locomover() {
        System.out.println("Nadando");

    }

    @Override
    public void EmitirSom() {
        System.out.println("som de peixe");

    }

    @Override
    public void Alimentar() {
        System.out.println("dsadsaf");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
