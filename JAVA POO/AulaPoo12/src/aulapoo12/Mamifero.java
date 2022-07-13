/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo12;

/**
 *
 * @author Usuário
 */
public class Mamifero extends Animal {
   private String corPelo;

    @Override
    public void Locomover() {
        System.out.println("correndo");

    }

    @Override
    public void EmitirSom() {
        System.out.println("som de mamifero");

    }

    @Override
    public void Alimentar() {
        System.out.println("mamando");

    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
