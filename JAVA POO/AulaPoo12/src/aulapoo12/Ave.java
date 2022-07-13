/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo12;

/**
 *
 * @author Usuário
 */
public class Ave extends Animal{
    private String corPena;
    
    public void fazerNinho(){
        System.out.println(" contruiu um ninho");
    
    }

    @Override
    public void Locomover() {
        System.out.println("voando");

    }

    @Override
    public void EmitirSom() {
        System.out.println("som de ave");

    }

    @Override
    public void Alimentar() {
        System.out.println("comendo fruta");

    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}    


   
