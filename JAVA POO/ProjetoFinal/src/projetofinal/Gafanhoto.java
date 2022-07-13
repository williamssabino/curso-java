/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author Usuário
 */
public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.totAssistindo  = 0;
    }

    public void viuMaisum() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "login=" + login + ", totAssistindo=" + totAssistindo + '}';
    }
    
    

}
