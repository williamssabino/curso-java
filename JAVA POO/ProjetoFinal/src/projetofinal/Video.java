/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author Usuário
 */
public class Video implements AcoesVideo {

    private String titulo;
    private int views, curtidas, avaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.avaliacao = 1;
        this.reproduzindo = false;
    }

    //METODOS ESPECIAIS 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //METODOS OVERRIDE
    @Override
    public void play() {
        if(this.getReproduzindo()==false){
            this.setReproduzindo(true);
        }

    }

    @Override
    public void pause() {
        if(this.getReproduzindo()==true){
            this.setReproduzindo(false);
        }

    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);

    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao + ", reproduzindo=" + reproduzindo + '}';
    }

}
