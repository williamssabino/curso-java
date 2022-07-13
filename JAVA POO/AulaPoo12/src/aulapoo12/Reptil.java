/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo12;

/**
 *
 * @author Usuário
 */
public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void Locomover() {
        System.out.println("rastejando");

    }

    @Override
    public void EmitirSom() {
        System.out.println("som de reptil");

    }

    @Override
    public void Alimentar() {
        System.out.println("comendo");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
