/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciociostreinamento;

/**
 *
 * @author Usuário
 */
public class Pessoa {
    private String nome,sexo;
    private int idade;
    
    public Pessoa(String nome, String sexo,int idade  ) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        
        
        
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        System.out.println( "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "}");
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "}";
    }
    
}
