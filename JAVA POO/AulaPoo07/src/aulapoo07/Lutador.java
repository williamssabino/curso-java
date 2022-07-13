/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo07;

public final class Lutador {

    private String nome, nacio, categoria;
    private int idade, vitorias, derrotas, empates;
    private float peso, altura;

    public Lutador(String nome, String nacio, int idade, int vitorias, int derrotas, int empates, float peso, float altura) {
        this.nome = nome;
        this.nacio = nacio;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.setPeso(peso);
        this.altura = altura;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        
        if(getPeso()<52.2){
            this.categoria= "Invalido";
        }
        else if(getPeso()<=70.3){
            this.categoria= "leve";

        }
        else if(getPeso()<=83.9){
            this.categoria="medio";
        }
        else if(getPeso()<=120.2){
            this.categoria = "pesado";
        }
        
        else{
            this.categoria="Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void status(){
        
    }
    
    public void apresentacao(){
        System.out.println("--------------------------");
        System.out.println("Luatador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacio());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+this.getPeso());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("Derrotas: "+this.getDerrotas());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
        
    }
    
}

