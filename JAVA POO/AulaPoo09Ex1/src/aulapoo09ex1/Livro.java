/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo09ex1;

/**
 *
 * @author Usuário
 */
public class Livro implements Publicacao{
    //Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }
    
    
    
    //Metodos
    public void detalhes(){
       
        if(this.getAberto()==true){
            
            System.out.println("---------------------");
            System.out.println("DETALHES DO LIVRO");
            System.out.println("---------------------");
            System.out.println("Autor: "+ this.getTitulo());
            System.out.println("Total de paginas: "+ this.getTotPaginas());
            System.out.println("Pagina Atual: "+ this.getPagAtual());
            System.out.println("Aberto: "+this.getAberto());
            System.out.println("Leitor: "+leitor.getNome());
        }
      
        else{
            
            System.out.println("---------------------");
            System.out.println("DETALHES DO LIVRO");
            System.out.println("---------------------");
            System.out.println("Autor: "+ this.getTitulo());
            System.out.println("Aberto: "+this.getAberto());
            System.out.println("Leitor: "+leitor.getNome());
            
        }
        
    }
    
    
    //Metodos Interface
    @Override
    public void abrir() {
        this.setAberto(true);

    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folhear(int p) {
       
        if(this.getAberto()==true){
            
            if(this.getTotPaginas()>=p){
                this.setPagAtual(p);
            }
           
            else{
                System.out.println("Não tem essa pagina no livro! ");
            }
        }
       
        else{
            System.out.println("Abra o livro!");
        }
    }

    @Override
    public void proxPag() {
       
        if(this.getAberto()==true){
          
            this.setPagAtual(this.getPagAtual()+1);
            
        }

    }

    @Override
    public void voltPag() {
        
        if(this.getAberto()==true){
           
            this.setPagAtual(this.getPagAtual()-1);
        }
    }

   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    
   
}
