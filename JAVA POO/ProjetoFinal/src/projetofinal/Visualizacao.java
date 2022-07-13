/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author Usuário
 */
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
        
    }
    
    public void Avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void Avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void Avaliar(float porc){
        
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
    
}
