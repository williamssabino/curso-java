/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo02;

/**
 *
 * @author Usuário
 */
public class Caneta {
   public String modelo, cor;
   private float ponta;
   protected int carga = 100 ;
   protected boolean tampada;
   
    public void status(){
        System.out.println(this.carga+"%");
        System.out.println(this.cor);
        System.out.println(this.modelo);
        System.out.println(this.ponta);
        System.out.println(this.tampada);
    }
    public void rabiscar(){
        if (tampada==true){
            System.out.println("Erro");
        }else{
            System.out.println("Rabiscar");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
