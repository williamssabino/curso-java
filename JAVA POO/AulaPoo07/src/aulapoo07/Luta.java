/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo07;

import java.util.Random;

/**
 *
 * @author Usuário
 */
public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())) {
            if (l1 != l2) {
                this.setAprovado(true);
                this.setDesafiado(l2);
                this.setDesafiante(l1);
            }
        } else {
            setAprovado(false);
        }

    }

    public void Lutar() {
        if (getAprovado() == true) {
            Random l = new Random();
            int lut = l.nextInt(3);
            System.out.println(lut);

            
                if(lut==0) {
                    System.out.println("Empatou");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                }

                else if(lut==1) {
                    System.out.println(desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                }

                else {
                    System.out.println(desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                }
            
        } 
       
        else {
            System.out.println("Luta não pode ser feita ");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
